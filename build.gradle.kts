plugins {
    kotlin("jvm") version "1.9.23"
}

group = "dev.noroom113"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

tasks.register("buildAllProjects") {
    group = "custom"
    description = "Build JAR for all projects"

    // List of project directories
    val projectDirs = listOf(
        "./Car_Rental-Car_Service",
        "./Car_Rental-Contract_Service",
        "./Car_Rental-Eureka_Server",
        "./Car_Rental-Gateway_Service",
        "./Car_Rental-Server_Config",
        "./Car_Rental-User_Service"
    )

    // Define action to build JAR for each project
    doLast {
        projectDirs.forEach { projectDir ->
            val dir = file(projectDir)
            if (dir.exists() && dir.isDirectory) {
                exec {
                    workingDir = dir
                    commandLine = listOf("./gradlew", "bootJar")
                }
            } else {
                logger.warn("Directory $dir does not exist or is not a directory.")
            }
        }
    }
}

tasks.register("buildAllProjectAndRunDockerCompose") {
    group = "custom"
    description = "Build JAR for all projects and run docker-compose"

    dependsOn("buildAllProjects")

    doLast {
        exec {
            workingDir = file("./")
            commandLine = listOf("docker-compose", "-f", "compose-dev.yaml", "up", "--build")
        }
    }
}
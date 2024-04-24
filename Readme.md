### Build all file Jar
```bash
./gradlew buildAllProjects
```
### Build all file Jar and run docker-compose
```bash
./gradlew buildAllProjectsAndRunDockerCompose
```
### Build all file Jar and build docker image then push to docker hub
```bash
./gradlew buildAllProjectsAndPushDockerImage
```
### Add submodule
```bash
git submodule add
```
### Update submodules
```bash
git submodule update --remote --merge
```
### Push image to docker hub
```bash
$ docker login
$ docker-compose build --pull
$ docker-compose push
$ docker logout
```
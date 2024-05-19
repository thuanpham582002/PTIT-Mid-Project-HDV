# 678510342
Nhóm chủ đề migrate từ ứng dụng/hệ thống on-premise sang docker/kuberness,
tự động quá trình deploy với mã nguồn từ github.

## Mô tả bài toán
### Bài toán 1 [Source](https://github.com/jnp2018/midproj-678510342/tree/main-spring)
- REQ: Deploy & control version prod cho project microservice backend spring boot.
  ----- API: backend -- spring boot
  ----- DATA: h2 database
  - Viết CI/CD, github action đưa docker
    - DEV
    - Product
### Bài toán 2 [Source](https://github.com/jnp2018/midproj-678510342/tree/main)
- REQ:
  ----- API: backend -- nodejs
  ----- WEB: frontend -- reactcjs
  ----- DATA: .zip của mongodb dump
  Hiện tại ---> API trực tiếp trên nginx --- frontend -- PM2
  - Viết CI/CD, github action đưa docker
    - DEV: lấy về và thiết lập môi trường --- restore starter db --> mongodb
    - Product:
      --------- Nginx để làm reverse proxy ---- 443 web
      --------- Certbot ---- Certificate
## Bài toán 1: [Source](https://github.com/jnp2018/midproj-678510342/tree/main-spring)
### Mô tả giải pháp
- Sử dụng Docker để containerize các service.
- Sử dụng Docker Compose để quản lý các container.
- Sử dụng Github Action để tự động hóa quá trình deploy.

[Flow](https://www.tldraw.com/s/v2_c_ROGF79UobtUaMYupIX7CL?v=-3402%2C-1592%2C11554%2C5621&p=Egs7S8klRV9A7DgjQxw3b)

### Ngôn ngữ và Framework sử dụng
- Backend: Spring Boot
- Database: H2 Database
- Triển khai: Docker, Docker compose, Dockerhub,Github action,
  Azure

### Tool Support
- Github Action
- Docker, Docker Compose
## Bài toán 2 [Source](https://github.com/jnp2018/midproj-678510342/tree/main)
### Mô tả giải pháp
- Sử dụng Docker để containerize các service.
- Sử dụng Docker Compose để quản lý các container.
- Sử dụng Github Action để tự động hóa quá trình deploy.

[Flow](https://www.tldraw.com/r/LyEwlbODE8RT30s7PLzF3?v=-2796,-1630,9317,5071&p=CiaJ_rHQJhNAijCHXuGJe)

### Ngôn ngữ và Framework sử dụng
- Frontend: ReactJs
- Backend: Nodejs
- Database: MongoDB
- Reverse Proxy: Nginx
- Triển khai: Docker, Docker compose, Dockerhub,Github action,
  Azure

### Tool Support
- Github Action
- Docker, Docker Compose

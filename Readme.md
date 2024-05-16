# 678510342
Nhóm chủ đề migrate từ ứng dụng/hệ thống on-premise sang docker/kuberness,
tự động quá trình deploy với mã nguồn từ github.

## Thành viên
- Nguyễn Thành Hưng - B20DCCN342
- Phạm Tiến Thuận - B20DCCN678
- Lê Quang Phúc - B20DCCN510

## Mô tả bài toán
- REQ:
  Source
  ----- API: backend -- nodejs
  ----- WEB: frontend -- reactcjs
  ----- DATA: .zip của mongodb dump
  Hiện tại ---> API trực tiếp trên nginx --- frontend -- PM2 
  - Viết CI/CD, github action đưa docker
    - DEV: lấy về và thiết lập môi trường --- restore starter db --> mongodb
    - Product:
      --------- Nginx để làm reverse proxy ---- 443 web
      --------- Certbot ---- Certificate

## Mô tả giải pháp
- Sử dụng Docker để containerize các service.
- Sử dụng Docker Compose để quản lý các container.
- Sử dụng Github Action để tự động hóa quá trình deploy.

  [Flow](https://www.tldraw.com/r/LyEwlbODE8RT30s7PLzF3?v=-2796,-1630,9317,5071&p=CiaJ_rHQJhNAijCHXuGJe)

## Ngôn ngữ và Framework sử dụng
- Frontend: ReactJs
- Backend: Nodejs
- Database: MongoDB
- Reverse Proxy: Nginx
- Triển khai: Docker

## Tool Support
- Github Action
- Docker
- .....
- ///q

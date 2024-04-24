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

### Require for report
Yêu cầu nội dung file báo cáo:
+ Mỗi bạn chọn tối thiểu 1, tối đa 3 chức năng mình cho là hay nhất/khó nhất trong số các chức năng/module của mình để trình bày.
+ Lựa chọn kiến trúc theo chiều dọc của hệ thống: hoặc theo web service thường, hoặc theo microserrvices, hoặc theo kiến trúc web thường
+ Kiến trúc theo chiều ngang ở mỗi bên (nếu có kiến trúc client/server) hoặc cho ứng dụng web đều theo MVC
- Thiết kế giao diện bên client/cho người dùng cuối (User Interface Design)
+ Với mỗi chức năng/module, trình bày:
- Hoạt động của module (Activity Diagram)
- Thiết kế thực thể (chung cho các module mình trình bày) (Entity Relationship Diagram)
- Thiết kế CSDL  (chung cho các module mình trình bày) (Database Diagram) done
- Thiết kế biểu đồ lớp chi tiết cho mỗi bên/ứng dụng (Class Diagram)
- (có diễn giải, phân tích ưu điểm pattern đã sử dụng, nếu có)
- Thiết kế biểu đồ tuần tự hoạt động chi tiết cho mỗi bên/ứng dụng (Sequence Diagram)

Yêu cầu hình thức:
- Mỗi bạn nộp báo cáo riêng
- Nộp duy nhất 1 file .pdf
- Trang bìa và tên file đầy đủ thông tin như các bài trước

Đánh giá:
- Bài báo cáo tính 50% điểm BTL, 50% còn lại điểm demo các module tương ứng thiết kế
- Sau khi chấm và được cmt bài này, các bạn sẽ phải sửa lại để nộp lấy điểm thi (thầy sẽ thông báo lịch nộp sau)
- Làm càng nhiều module (tối đa 3) điểm càng cao
- Module càng hay, càng khó, điểm càng cao
- Tích hợp và phát huy được ưu điểm của càng nhiều công nghệ đã học của môn học, điểm càng cao.
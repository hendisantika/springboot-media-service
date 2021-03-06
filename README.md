# springboot-media-service
### Things todo list:
1. Clone this repository: `git clone https://github.com/hendisantika/springboot-media-service.git`
2. Go to your folder: `cd springboot-media-service`
3. Run the application: `mvn clean spring-boot:run`
4. Open your postman application.

So the controller has two mappings:

    For uploading file
        Request URL: /api/files/upload
        Request Parameters: Actual file, userId, docType
        Response: Will return JSON having file information(Shown in last part of this article)
     For downloading file
        Request URL: /api/files/download
        Request Parameters: userId and docType
        Response: Will return the file in attachment along with content-type and other details. (If file not found for that user it will return 404 Not found code)

In order to secure your API with Spring Basic Auth add below the class. Update the required user name and password (use [online BCrypt encoder](https://bcrypt-generator.com/) to encode your password).

SQL Console:
```sql
MariaDB [merchant]> select * from merchant_documents;
+-------------+---------+-----------------+---------------+---------------+------------+
| document_id | user_id | document_format | document_type | file_name     | upload_dir |
+-------------+---------+-----------------+---------------+---------------+------------+
|           1 |       1 | image/png       | License       | 1_License.png | NULL       |
|           2 |       1 | image/png       | png           | 1_png.png     | NULL       |
+-------------+---------+-----------------+---------------+---------------+------------+
2 rows in set (0.006 sec)

```

### Screen shot
Upload a Document

![Upload a Document](img/upload1.png "Upload a Document")

![Upload a Document](img/upload2.png "Upload a Document")

Download a Document

![Download a Document](img/download1.png "Download a Document")

![Download a Document](img/download2.png "Download a Document")

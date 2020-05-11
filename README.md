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

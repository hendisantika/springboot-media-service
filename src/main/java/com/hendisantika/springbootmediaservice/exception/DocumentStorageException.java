package com.hendisantika.springbootmediaservice.exception;

/**
 * Created by IntelliJ IDEA. Project : springboot-media-service User: hendisantika Email:
 * hendisantika@gmail.com Telegram : @hendisantika34 Date: 06/05/20 Time: 09.40
 */
public class DocumentStorageException extends RuntimeException {
  public DocumentStorageException(String message) {
    super(message);
  }

  public DocumentStorageException(String message, Throwable cause) {
    super(message, cause);
  }
}

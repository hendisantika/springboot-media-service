package com.hendisantika.springbootmediaservice.service;

import com.hendisantika.springbootmediaservice.entity.DocumentStorageProperties;
import com.hendisantika.springbootmediaservice.exception.DocumentStorageException;
import com.hendisantika.springbootmediaservice.repository.DocumentStoragePropertiesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-media-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/05/20
 * Time: 09.38
 */
public class DocumentStorageService {
    private final Path fileStorageLocation;

    @Autowired
    private DocumentStoragePropertiesRepository docStorageRepo;

    public DocumentStorageService(DocumentStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir()).toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (IOException e) {
            throw new DocumentStorageException("Could not create the directory where the uploaded files will be " +
                    "stored.", e);
        }

    }
}

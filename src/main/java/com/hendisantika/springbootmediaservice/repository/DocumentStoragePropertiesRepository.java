package com.hendisantika.springbootmediaservice.repository;

import com.hendisantika.springbootmediaservice.entity.DocumentStorageProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-media-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/05/20
 * Time: 09.36
 */
public interface DocumentStoragePropertiesRepository extends JpaRepository<DocumentStorageProperties, Integer> {
    @Query("Select a from DocumentStorageProperties a where user_id = ?1 and document_type = ?2")
    DocumentStorageProperties checkDocumentByUserId(Integer userId, String docType);
}

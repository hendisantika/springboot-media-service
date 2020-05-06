package com.hendisantika.springbootmediaservice.controller;

import com.hendisantika.springbootmediaservice.service.DocumentStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-media-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/05/20
 * Time: 09.50
 */
@RestController
@RequestMapping(value = "api")
public class DocumentController {
    @Autowired
    private DocumentStorageService documentStorageService;
}

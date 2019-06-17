package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@Slf4j
public class RestCtrl {
    @PostMapping("/fileupload")
    public ResponseEntity<Object> upload(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok().body("File uploaded");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> greeting(){
        return ResponseEntity.ok().body("Hello");
    }
}

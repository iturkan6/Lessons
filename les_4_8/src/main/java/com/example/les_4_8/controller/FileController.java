package com.example.les_4_8.controller;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
@Log4j2
public class FileController {

    // This 2 methods used for upload file from user and download file to backend
    @GetMapping
    public String handle_get() {
        return "index.html";
    }

    @PostMapping
    @SneakyThrows
    @ResponseBody
    public String handle_post(@RequestParam("filecontents") MultipartFile file) {
        byte[] bytes = file.getBytes();
        String contents = new String(bytes);
        log.info(contents);
        return String.format("File %s got. Contents: %s", file.getName(), contents);
    }

    // This method used for downloading file for user and uploading file from backend
    @GetMapping("/download")
    public ResponseEntity<Resource> handleDownload() {
//        Resource resource = new ClassPathResource("fromBack.txt");
        ClassPathResource resource = new ClassPathResource("fromBack.txt");
        return ResponseEntity.ok(resource);
    }

    // This method used for downloading file for user and uploading file from backend
    @GetMapping("/download1/{filename:.+}")
    public ResponseEntity<Resource> handleDownload1(@PathVariable String filename) {
//        Resource resource = new ClassPathResource("fromBack.txt");
        ClassPathResource resource = new ClassPathResource(filename);
        return ResponseEntity.ok(resource);
    }
}

package com.stresstest.apirest_beac.controller;

import java.io.IOException;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.stresstest.apirest_beac.service.UploadFileService;

@RestController
@RequestMapping("/files")
@RequiredArgsConstructor
@CrossOrigin
public class UploadFileController {
    private final UploadFileService uploadFileService;

    @PostMapping("/uploadFile/{idBank}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void submit(@RequestParam("file") MultipartFile file, @PathVariable String idBank) {
        uploadFileService.uploadFileAndNotify(file, idBank);
    }

}

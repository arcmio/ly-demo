package com.leyou.upload.service;


import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.Arrays;
import java.util.List;

@Service
public class UploadService {

    private static final List<String> content_types = Arrays.asList("image/gif", "image/jpeg");

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UploadService.class);
    public String uploadImage(MultipartFile file) {
        String originalFilename = file.getOriginalFilename();

        //校验文件类型
        String contentType = file.getContentType();
        if (!content_types.contains(contentType)) {
            return null;
        }
        //校验文件内容

        //保存到文件服务器

        //返回url，进行回显
    }
}

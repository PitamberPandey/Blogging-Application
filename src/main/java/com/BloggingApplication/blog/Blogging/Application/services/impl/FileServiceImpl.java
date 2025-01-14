package com.BloggingApplication.blog.Blogging.Application.services.impl;

import com.BloggingApplication.blog.Blogging.Application.services.FileService;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        // Original file name
        String name = file.getOriginalFilename();

        // Generate a random name for the file
        String randomID = UUID.randomUUID().toString();
        String fileName = randomID + name.substring(name.lastIndexOf("."));

        // Full path for the file
        String filePath = path + File.separator + fileName;

        // Create the directory if it does not exist
        File directory = new File(path);
        if (!directory.exists()) {
            directory.mkdirs(); // Create the directory including any necessary but nonexistent parent directories
        }

        // Copy file to the destination
        Files.copy(file.getInputStream(), Paths.get(filePath));

        return fileName; // Return the new file name
    }

    @Override
    public InputStream getResource(String path, String fileName) throws FileNotFoundException {
        // Full path of the file
        String filePath = path + File.separator + fileName;

        // Return a FileInputStream to read the file
        return new FileInputStream(filePath);
    }
}

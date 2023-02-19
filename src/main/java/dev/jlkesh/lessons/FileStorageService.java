package dev.jlkesh.lessons;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileStorageService {
    Path rootPath; // home

    void init() {
        if (!Files.exists(rootPath)) {
/*
            Files.createDirectories(rootPath);
*/
        }
    }
}

package com.example.filesandfoldersHW.components;


import com.example.filesandfoldersHW.models.File;
import com.example.filesandfoldersHW.models.Folder;
import com.example.filesandfoldersHW.models.User;
import com.example.filesandfoldersHW.repositories.FileRepository;
import com.example.filesandfoldersHW.repositories.FolderRepository;
import com.example.filesandfoldersHW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user1 = new User("Kevin");
        userRepository.save(user1);

        Folder folder1 = new Folder("Word files", user1);
        folderRepository.save(folder1);

        File file1 = new File("file1", "doc", 20, folder1);
        fileRepository.save(file1);


    }
}

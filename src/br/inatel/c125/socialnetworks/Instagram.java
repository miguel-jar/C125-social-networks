package br.inatel.c125.socialnetworks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Instagram extends SocialNetwork {

    public Instagram() {
        try {
            Path file = Paths.get("src/br/inatel/c125/files/instagram.txt");
            List<String> list = Files.readAllLines(file);

            this.password = list.get(0).split("=")[1];
            this.numFriends = Integer.parseInt(list.get(1).split("=")[1]);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public void postPhoto() {
        System.out.println("Photo successfully posted on Instagram");
    }

    @Override
    public void postVideo() {
        System.out.println("Video successfully posted on Instagram");
    }

    @Override
    public void postComment() {
        System.out.println("Comment successfully published on Instagram");
    }
}
package br.inatel.c125.socialnetworks;

import br.inatel.c125.interfaces.Sharing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Twitter extends SocialNetwork implements Sharing {

    public Twitter() {
        try {
            Path file = Paths.get("src/br/inatel/c125/files/twitter.txt");
            List<String> list = Files.readAllLines(file);

            this.password = list.get(0).split("=")[1];
            this.numFriends = Integer.parseInt(list.get(1).split("=")[1]);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public void postPhoto() {
        System.out.println("Photo successfully posted on Twitter");
    }

    @Override
    public void postVideo() {
        System.out.println("Video successfully posted on Twitter");
    }

    @Override
    public void postComment() {
        System.out.println("Comment successfully published on Twitter");
    }

    @Override
    public void share() {
        System.out.println("Post successfully shared on Twitter");
    }
}
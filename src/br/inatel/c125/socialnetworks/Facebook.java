package br.inatel.c125.socialnetworks;

import br.inatel.c125.interfaces.Sharing;
import br.inatel.c125.interfaces.VideoConference;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Facebook extends SocialNetwork implements VideoConference, Sharing {

    public Facebook() {
        try {
            Path file = Paths.get("src/br/inatel/c125/files/facebook.txt");
            List<String> list = Files.readAllLines(file);

            this.password = list.get(0).split("=")[1];
            this.numFriends = Integer.parseInt(list.get(1).split("=")[1]);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public void postPhoto() {
        System.out.println("Photo successfully posted on Facebook");
    }

    @Override
    public void postVideo() {
        System.out.println("Video successfully posted on Facebook");
    }

    @Override
    public void postComment() {
        System.out.println("Comment successfully published on Facebook");
    }

    @Override
    public void stream() {
        System.out.println("Starting Stream on Facebook...");
        System.out.println("Stream finished");
    }

    @Override
    public void share() {
        System.out.println("Post successfully shared on Facebook");
    }
}
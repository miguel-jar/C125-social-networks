package br.inatel.c125;

import br.inatel.c125.socialnetworks.*;
import br.inatel.c125.user.User; // Alterado de 'usuario' para 'user'

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<SocialNetwork> socialNetworks = new ArrayList<>();

        socialNetworks.add(new Facebook());
        socialNetworks.add(new Twitter());

        User user = new User("Bagatela", "eldourado@ss.com.br", socialNetworks);

        System.out.println();

        try {
            SocialNetwork account = user.getSocialNetworks().get(0);
            account.postPhoto();

            if (account instanceof Facebook facebook) {

                facebook.share();
                facebook.stream();

            } else if (account instanceof GooglePlus googlePlus) {

                googlePlus.share();
                googlePlus.stream();

            } else if (account instanceof Twitter twitter) {

                twitter.share();
                System.out.println("Error: this type of account does not support streaming");

            } else {
                System.out.println("Error: this type of account does not support sharing");
                System.out.println("Error: this type of account does not support streaming");
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            SocialNetwork account = user.getSocialNetworks().get(1);

            account.postComment();
            account.likePost();
            account.postVideo();

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nProgram finished");
    }
}
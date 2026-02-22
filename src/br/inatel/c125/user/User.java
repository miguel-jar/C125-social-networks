package br.inatel.c125.user;

import br.inatel.c125.socialnetworks.SocialNetwork;

import java.util.List;

public class User {

    @SuppressWarnings("FieldCanBeLocal")
    private final String name;
    private final String email;

    private final List<SocialNetwork> socialNetworks;

    public User(String name, String email, List<SocialNetwork> socialNetworks) {
        this.name = name;
        this.email = email;
        this.socialNetworks = socialNetworks;
    }

    public List<SocialNetwork> getSocialNetworks() {
        return socialNetworks;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

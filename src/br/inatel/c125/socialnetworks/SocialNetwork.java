package br.inatel.c125.socialnetworks;

public abstract class SocialNetwork {
    protected String password;
    protected int numFriends;

    public abstract void postPhoto();

    public abstract void postVideo();

    public abstract void postComment();

    public void likePost() {
        System.out.println("Post successfully liked");
    }
}
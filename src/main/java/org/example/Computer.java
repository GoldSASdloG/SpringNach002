package org.example;

public class Computer {
    private VideoCard videoCard;

    public Computer(VideoCard videoCard) {
        System.out.println("комп создан!!!");
        this.videoCard = videoCard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }
}

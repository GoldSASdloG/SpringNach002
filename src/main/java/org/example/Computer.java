package org.example;

public class Computer {
    private VideoCard videoCard;

    public Computer(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
}

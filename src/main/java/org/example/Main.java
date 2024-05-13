package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        VideoCard card = context.getBean("video", VideoCard.class);
        Computer computer = context.getBean("comp", Computer.class);
        computer.getVideoCard().check();

    }
}

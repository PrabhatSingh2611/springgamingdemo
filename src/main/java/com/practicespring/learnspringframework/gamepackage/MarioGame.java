package com.practicespring.learnspringframework.gamepackage;


import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    @Override
    public void upkey(){
        System.out.println("up");
    }

    @Override
    public void downkey(){
        System.out.println("down");
    }

    @Override
    public void leftkey(){
        System.out.println("left");
    }

    @Override
    public void rightkey(){
        System.out.println("right");
    }

}

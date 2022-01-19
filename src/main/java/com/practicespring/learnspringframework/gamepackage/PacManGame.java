package com.practicespring.learnspringframework.gamepackage;

public class PacManGame implements GamingConsole {

    @Override
    public void upkey(){
        System.out.println("go up");
    }

    @Override
    public void downkey(){
        System.out.println("go down");
    }

    @Override
    public void leftkey(){
        System.out.println("go left");
    }

    @Override
    public void rightkey(){
        System.out.println("go right");
    }

}

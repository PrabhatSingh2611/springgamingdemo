package com.practicespring.learnspringframework.gamepackage;

public class SuperContraGame implements GamingConsole{

    public void upkey(){ System.out.println("jump"); }

    public void downkey(){
        System.out.println("go into a hole");
    }

    public void leftkey(){
        System.out.println("stop");
    }

    public void rightkey(){
        System.out.println("go faster");
    }

}

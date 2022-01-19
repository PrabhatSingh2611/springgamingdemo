package com.practicespring.learnspringframework.gamepackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void runGame() {
        game.upkey();
        game.downkey();
        game.leftkey();
        game.rightkey();
    }

}

package com.practicespring.learnspringframework;

import com.practicespring.learnspringframework.gamepackage.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//Iteration 1

@SpringBootApplication
public class SpringFrameworkApplicationDemo {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(SpringFrameworkApplicationDemo.class, args);

        GameRunner runner = context.getBean(GameRunner.class);

//Internally Spring create instance
/*
		MarioGame gamemario = new MarioGame();
		SuperContraGame gamesupercontr = new SuperContraGame();
		PacManGame gamepacman = new PacManGame();

		GameRunner runner = new GameRunner(gamemario);
		runner.runGame();
*/
    }

}
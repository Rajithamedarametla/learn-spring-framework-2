package com.secprogram.learnspringFwork.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.secprogram.learnspringFwork.game")
public class App03gamingBasic {
    public static void main(String args[]){
            try(var Context = new AnnotationConfigApplicationContext
                    (App03gamingBasic.class)) {
                Context.getBean(GameConsole.class).up();
                Context.getBean(GameRunner.class).run();


            }

        }

    }




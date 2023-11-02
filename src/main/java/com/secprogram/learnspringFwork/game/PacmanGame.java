package com.secprogram.learnspringFwork.game;

import org.springframework.stereotype.Component;

@Component

public class PacmanGame implements GameConsole{

 public void up(){
     System.out.println("up");

    }
    public void down(){

     System.out.println("down");
    }
    public void left(){
     System.out.println("left");

    }
    public void right(){
     System.out.println("right");
    }
}
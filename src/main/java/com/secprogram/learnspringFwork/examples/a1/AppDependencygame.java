package com.secprogram.learnspringFwork.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;




@Configuration
@ComponentScan("com.secprogram.learnspringFwork.example.a1")
public class AppDependencygame {
    public static void main(String args[]){
            try(var Context = new AnnotationConfigApplicationContext
                    (AppDependencygame.class)) {
                Arrays.stream(Context.getBeanDefinitionNames())
                        .forEach(System.out::println);



            }

        }

    }




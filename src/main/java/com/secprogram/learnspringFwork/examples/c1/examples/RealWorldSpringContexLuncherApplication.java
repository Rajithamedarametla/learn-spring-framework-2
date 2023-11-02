package com.secprogram.learnspringFwork.examples.c1.examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;




@Configuration
@ComponentScan("com.secprogram.learnspringFwork.examples.c1.examples")
public class RealWorldSpringContexLuncherApplication {
    public static void main(String args[]){
            try(var Context = new AnnotationConfigApplicationContext
                    (RealWorldSpringContexLuncherApplication.class)) {
                Arrays.stream(Context.getBeanDefinitionNames())
                        .forEach(System.out::println);



            }

        }

    }




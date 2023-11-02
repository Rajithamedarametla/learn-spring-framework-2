package com.secprogram.learnspringFwork.examples.h1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlContextLuncherClass {
    public static void main(String args[]){
            try(var context = new ClassPathXmlApplicationContext("ContextConfiguration.xml"))
                  {
                Arrays.stream(context.getBeanDefinitionNames())
                        .forEach(System.out::println);
                System.out.println(context.getBean("name"));
                System.out.println(context.getBean("age"));
                System.out.println(context.getBean("Address"));



            }

        }

    }




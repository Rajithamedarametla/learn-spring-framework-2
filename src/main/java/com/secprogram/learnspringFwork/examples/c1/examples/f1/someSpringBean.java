package com.secprogram.learnspringFwork.examples.c1.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class someClass {
    private final SomeDependency someDependency;
    public someClass(SomeDependency someDependency){
        super();
        this.someDependency =someDependency;
        System.out.println("all dependencies are ready!");
    }
   @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }
    @PreDestroy
    public void Cleanup(){
        System.out.println("Cleanup!");
    }

}
@Component
class SomeDependency{
    public void getReady() {
        System.out.println("Some dependencies are Ready.");
    }
}
    @Configuration
    @ComponentScan
    public  class someSpringBean {
        public static void main(String[] args) {
            try (var Context = new AnnotationConfigApplicationContext
                    (someSpringBean.class)) {
                Arrays.stream(Context.getBeanDefinitionNames())
                        .forEach(System.out::println);


            }

        }
    }





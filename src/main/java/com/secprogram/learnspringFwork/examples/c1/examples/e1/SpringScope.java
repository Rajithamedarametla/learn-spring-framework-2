package com.secprogram.learnspringFwork.examples.c1.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class NormalClass{

}
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{

}
@Configuration
    @ComponentScan
    public  class SpringScope {
    public static void main(String args[]) {
        try (var Context = new AnnotationConfigApplicationContext
                (SpringScope.class)) {
            Arrays.stream(Context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            System.out.println(Context.getBean(NormalClass.class));
            System.out.println(Context.getBean(NormalClass.class));
            System.out.println(Context.getBean(PrototypeClass.class));
            System.out.println(Context.getBean(PrototypeClass.class));
            System.out.println(Context.getBean(PrototypeClass.class));

        }
    }
}





package com.secprogram.learnspringFwork.examples.c1.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
 class yourBusinessClass {
    Dependency1 dependency1;
    Dependency2 dependency2;

    public yourBusinessClass(Dependency1 dependency1) {
        System.out.println("Constructor Injection-yourBusinessClass");
        this.dependency1 = dependency1;
    }

    public yourBusinessClass(Dependency2 dependency2) {
        System.out.println("Constructor Injection-yourBusinessClass");
        this.dependency2 = dependency2;
    }
// @Autowired
    //public void setDependency1(Dependency1 dependency1) {
      //  System.out.println("Setter Injection-setDependency1");
        //this.dependency1 = dependency1;
    //}

   // @Autowired
    //public void setDependency2(Dependency2 dependency2) {
      //  System.out.println("Setter Injection-setDependency2");
        //this.dependency2 = dependency2;
    //}

    public String toString() {
        return "using" + dependency1 + "and" + dependency2;
    }
    @Component
    class Dependency1{}
    @Component
    class Dependency2{}
    @Configuration
    @ComponentScan("com.secprogram.learnspringFwork.example.a1")
    public static class AppDependencygame {
        public static void main(String args[]) {
            try (var Context = new AnnotationConfigApplicationContext
                    (AppDependencygame.class)) {
                Arrays.stream(Context.getBeanDefinitionNames())
                        .forEach(System.out::println);


            }

        }
    }
}




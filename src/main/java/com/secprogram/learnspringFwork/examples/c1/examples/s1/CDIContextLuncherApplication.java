package com.secprogram.learnspringFwork.examples.c1.examples.s1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
class BusinessService {
   private DataService dataService;
@Autowired
    public DataService getDataService() {
    System.out.println("Setter Injection");
        return dataService;
    }

    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }
}
@Component
  class DataService{

}
@Configuration
@ComponentScan
public class CDIContextLuncherApplication {

    public static void main(String[] args) {
            try (var Context = new AnnotationConfigApplicationContext
                    (CDIContextLuncherApplication.class)) {
                Arrays.stream(Context.getBeanDefinitionNames())
                        .forEach(System.out::println);


            }

        }
}

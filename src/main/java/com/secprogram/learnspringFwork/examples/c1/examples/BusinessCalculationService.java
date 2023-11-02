package com.secprogram.learnspringFwork.examples.c1.examples;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component

public class BusinessCalculationService {
     private DataService dataService;
     public BusinessCalculationService( DataService dataService){
         super();
         this.dataService = dataService;
     }
    public int findMax(){
        return Arrays.stream(dataService.reteriveData()).max().orElse(0);
    }
}

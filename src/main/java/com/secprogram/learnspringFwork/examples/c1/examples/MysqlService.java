package com.secprogram.learnspringFwork.examples.c1.examples;

import org.springframework.stereotype.Component;

@Component

public  class MysqlService implements DataService{
    @Override
    public int[] reteriveData() {

        return new int[] {1,2,3,4,5};
    }
}

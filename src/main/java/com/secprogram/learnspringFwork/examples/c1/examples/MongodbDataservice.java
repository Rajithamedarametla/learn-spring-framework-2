package com.secprogram.learnspringFwork.examples.c1.examples;

import org.springframework.stereotype.Component;

@Component
public  class MongodbDataservice implements DataService{
    @Override
    public int[] reteriveData() {
        return new int[] {11,22,33,44,55};
    }
}

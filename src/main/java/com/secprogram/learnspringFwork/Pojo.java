package com.secprogram.learnspringFwork;

import java.io.Serializable;

public class Pojo {
    private String text;
    private int number;
    public String toString (){
        return text +":"+ number;
    }
}
class JavaBean implements Serializable {
    public JavaBean() {}
        private String text;
        private int number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
}
/*class SpringBootVsJavaBean{
    public static void main(String args[]){
        Pojo pojo = new Pojo();
        System.out.println(pojo);

    }

}*/
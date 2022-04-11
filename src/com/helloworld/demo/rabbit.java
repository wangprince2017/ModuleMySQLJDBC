package com.helloworld.demo;

public class rabbit {
    public static void main(String[]args) {
//新兔子生下来过两个月就可以自己生
        int a=1;//0 month
        int b=0;//1 month
        int c=0;//2 months or longer
        for(int month=2;month<=20;month++){
            c=c+b;
            b=a;
            a=c;
        }
        int total=a+b+c;
        System.out.println(total);
    }
}
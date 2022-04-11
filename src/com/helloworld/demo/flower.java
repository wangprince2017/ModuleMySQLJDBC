package com.helloworld.demo;

public class flower {
    public static void main(String[]args) {
        for(int a = 1;a <= 9;a++) {
            for(int b = 0;b <= 9;b++) {
                for(int c = 0;c <= 9;c++) {
                    int i = a*a*a + b*b*b + c*c*c;
                    int j = a*100 + b*10 + c;
                    if (i == j) {
                        System.out.println("水仙花数：" + i);
                    }
                }
            }
        }
        System.out.println("结束.");
    }
}
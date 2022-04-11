package com.helloworld.demo;

//百钱百鸡 个人觉得这个算的 比较少
public class chicken {
    public static void main(String[]args) {
        for(int gongji = 0;gongji<=100/5;gongji++){
            for(int muji = 0;muji<=(100-gongji*5)/3;muji++){
                int xiaoji=(100-gongji-muji);
                if(xiaoji % 3 == 0 && gongji*5 + muji*3 + xiaoji/3 ==100){
                    System.out.println("公鸡为:" + gongji +"只  母鸡为："+ muji + "只  小鸡为：" + xiaoji + "只");
                }
            }
        }
    }
}
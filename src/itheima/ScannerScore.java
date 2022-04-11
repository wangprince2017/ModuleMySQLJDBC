package itheima;

import java.util.Scanner;

public class ScannerScore{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("小明的分数：");
        double score = input.nextDouble();
        if (score>=90&&score<=100){
            System.out.println("游玩七天");
        }else if (score>=80&&score<90){
            System.out.println("变形金刚");
        }else if (score>=70&&score<80){
            System.out.println("学习资料一份");
        }else if (score>=60&&score<70){
            System.out.println("培训班半年");
        }else if (score<60&&score>=0){
            System.out.println("男女混合双打");
        }else {
            System.out.println("你数学给谁学的不知道分数只有100分吗？");
        };
    }
}
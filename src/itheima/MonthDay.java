package itheima;

//输出一年的日期，难点在于有些月份会有不同的天数，要用分支语句根据不同的月份执行相应的代码
public class MonthDay{
    public static void main(String[] args){
        for(int month=1; month <=12;month++) {
            switch(month){
                case 1 :
                case 3 :
                case 5 :
                case 7 :
                case 8 :
                case 10 :
                case 12 :
                    for(int number = 1; number <= 31; number++){
                        System.out.println(month + "月" + number + "号");
                    }
                    break;
                case 2 :
                    for(int number2 = 1; number2 <= 28; number2++){
                        System.out.println(month + "月" + number2 + "号");
                    }
                    break;
                case 4 :
                case 6 :
                case 9 :
                case 11 :
                    for(int number3= 1; number3 <= 30; number3++){
                        System.out.println(month + "月" + number3 + "号");
                    }
                    break;
                default :
                    System.out.println("   ");
                    break;
            }
        }
    }
}
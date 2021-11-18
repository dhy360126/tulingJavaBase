package javaFirstPart.javaBase;

import java.util.Scanner;
//
public class DataStructorWork2 {
    public static void main(String[] args) {
       // scannerAdd();
       // updateDouble();
        //identifyAge();
       // identifyAgeEquares();
       // getEveryData();
        identifyPassword();

    }
    //键盘输入两个整数相加，打印结果
    public static void scannerAdd(){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num2+ num1;
        System.out.println("sum::"+sum);
    }

    //声明double变量，然后键盘输入变量来更新值
    public static  void updateDouble(){
        Scanner scanner = new Scanner(System.in);
        double dd = 12.78;
        dd = scanner.nextDouble();
        System.out.println(dd);

    }
    //键盘输入年龄，判断年龄是否大于等于18岁
    public static void identifyAge(){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("年龄大于18岁");
        }else{
            System.out.println("年龄小于等于18");
        }
    }

    //键盘输入两个年龄，判断两者年龄是否相等
    public static void identifyAgeEquares(){
        Scanner scanner = new Scanner(System.in);
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        System.out.println(age1 == age2 ? "两个年龄相等" : "两个年龄不相等");
    }
    //键盘输入一个四位数的整数，分别获取各个位数
    public static void getEveryData(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        /*获取各个位数的方法，举例 12345
        * 12345%10=5
        * 12345/10=1234
        * 1234%10=4
        * 1234/10=123
        * 123%10=3
        * 123/10=12
        * 12%10=2
        * 12/10=1*/
        while(num>0){
            int everynum = num%10;
            num = num/10;
            System.out.print(everynum+" ");
        }
    }

    //验证键盘输入的用户名和密码，判断是否为admin和123456
    public static  void identifyPassword(){
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        String password = scanner.next();
        System.out.println(userName.equals("admin")&&password.equals("123456") ? "一致" :"不一致");
    }
}

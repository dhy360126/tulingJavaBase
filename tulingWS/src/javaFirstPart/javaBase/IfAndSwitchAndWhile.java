package javaFirstPart.javaBase;

import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class IfAndSwitchAndWhile {
    public static void main(String[] args) throws ParseException {

        //ifWeekend(4);
        //switchWeekend(3);
        //isRunYear(2008);
        //getTicketPrice(4,4000);
        //getSevenMutiple();
       // getTotalDays("2021-01-01","2021-05-31");
        //getTotalDays();
        //getNum();
       // getNum2();
        //getNum3();
        //printNineExcel();
        checkAdmin("admin","123");

    }

    //给定数字，判断星期几，用if完成
    public static void ifWeekend(int i) {
        if (i == 1) {
            System.out.println("星期一");
        } else if (i == 2) {
            System.out.println("星期二");
        } else if (i == 3) {
            System.out.println("星期三");
        } else if (i == 4) {
            System.out.println("星期四");
        } else {
            System.out.println("不清楚星期几");
        }
    }

    //给定数字，判断星期几，用switch完成
    public static void switchWeekend(int i) {
        switch (i) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            default:
                System.out.println("不知道星期几");
        }
    }

    //根据给定的年份，判断是否是闰年
    public static void isRunYear(int year) {
        boolean isLun = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        System.out.println(isLun ? "闰年" : "非闰年");
    }

    //计算机票的价格
    public static void getTicketPrice(int month, double ticketPrice) {
        double headerPrice = 0;
        double economyPrice = 0;
        switch (month) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                headerPrice = ticketPrice * 0.9;
                economyPrice = ticketPrice * 0.7;
            default:
                headerPrice = ticketPrice * 0.6;
                economyPrice = ticketPrice * 0.3;
        }
        System.out.println("headerPrice:" + headerPrice + ";economyPrice:" + economyPrice);
    }

    //输出1-100中7的倍数
    private static void getSevenMutiple() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //统计1月到五月的总的天数
    private static void getTotalDays(String date1, String date2) throws ParseException {
        Date transDate1 = transToDate(date1);
        Date transDate2 = transToDate(date2);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(transDate1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(transDate2);
        long days = (transDate2.getTime()-transDate1.getTime()) / (24*60*60*1000)+1;
        System.out.println("days："+days);


    }

    public static Date transToDate(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simpleDateFormat.parse(date);
        return date1;
    }

    //获取某一年中奇数个月的总天数
    public static void getTotalDays() throws ParseException {
        int sumDays = 0;
        for(int i =1;i<=12;i++){
            if(i%2 !=0){
                int monthDay =0;
                System.out.print(i+" ");
                String dateStr = i<10 ? "20210"+i: "2021"+i;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
                Calendar calendar = Calendar.getInstance();
                Date monthDate = simpleDateFormat.parse(dateStr);
                calendar.setTime(monthDate);
                monthDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                sumDays +=monthDay;
            }
        }
        System.out.println("sumDays::"+sumDays);
    }

    //操场上有一群人，人数在100到200之间。三人一组多1人，四人一组多2人，五人一组多3人。问操场上共有多少人。
    public static  void getNum(){
        for(int i =100;i<=200;i++){
            if(i%3==1 && i%4==2 && i%5==3){
                System.out.print("操场上人数为："+i+";");
            }
        }
    }

    //.一个四位数，恰好等于去掉它的首位数字之后所剩的三位数的3倍，这个四位数是多少
    public static  void getNum2(){
        for(int i =1000;i<=9999;i++){
            String replaceNum = String.valueOf(i).substring(1,4);
            if(i == Integer.parseInt(replaceNum)*3){
                System.out.print(i+" ");
            }
        }
    }

    //打印出1-500所有的自然数中不包含4的自然数，共有多少个
    public static void getNum3(){
        for (int i=1;i<500;i++){
            if(!String.valueOf(i).contains("4")){
                System.out.print(i+" ");
            }
        }
    }

    //打印九九乘法表
    public static  void printNineExcel(){
        for(int i =1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+" ");
            }
            System.out.println();
        }
    }
    //打印5行正向金字塔
    public static void printR(){
        for(int i =1;i<=9;i++){

        }

    }

    //使用while循环，验证键盘输入的用户名和密码，验证失败3次，锁定账户，不让再登录了。
    public static void checkAdmin(String userName,String passWord){
        Scanner scanner = new Scanner(System.in);
        int i=0;
        do{
            i++;
            String printUserName = scanner.next();
           String printPassWord = scanner.next();

           if(printUserName.equals(userName)&& passWord.equals(printPassWord)){
               System.out.print("用户校验成功");
           }else{
               System.out.print("用户校验失败");
           }
        }while(i<=3);
            System.out.print("验证失败超过3次，锁定账户");
            scanner.close();

    }

}

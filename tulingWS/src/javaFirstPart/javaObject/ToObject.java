package javaFirstPart.javaObject;

public class ToObject {
    public static void main(String[] args) {
        //getNum(10);
        //isRunYear(2021);
        //System.out.print(recursion(3));
        printStyle(10);



    }
    //设计一个方法，用于求1-n的和
    public static  void getNum(int n){
        int sum = 0;
        for(int i =0;i<=n;i++){
            sum +=i;
        }
        System.out.print("阶级和sum::"+sum);
    }
    //设计一个方法，用于返回给定年份是否是闰年
    public static void isRunYear(int year){
        // 能被4证除且不能被100整除或者能被400整除
        if((year%4 == 0 && year %100 !=0 )|| year%400==0){
            System.out.print("是闰年");
        }else{
            System.out.print("不是闰年");
        }
    }
    //使用递归算法，求n的阶乘
    public static int recursion(int n){
        if(n==0){
            return 1;
        }else{
          return   n*recursion(n-1);
        }
    }

    /*
    3.设计一个方法，打印以下形状
        1
        12
        123
        1234
        12345
    * */

    public static  void printStyle(int n){
        if(n>=1){
            for(int i=1;i<=n;i++){
                for(int j =1;j<=i;j++){
                    if(j==i){
                        System.out.println(j);
                    }else{
                        System.out.print(j);
                    }


                }
            }
        }else{
            System.out.print("请输入大于1的参数");
        }
    }
}

package javaFirstPart.javaBase;

public class DataStructorWork {
    public static void main(String[] args) {
        transVar();
        transVar2();
        transVar3();
        errorCompile2();

    }
    //变量转换
    public static void transVar(){
        byte a =65;
        char b = (char) a;
        int c = b;
        System.out.println("a："+a+";b:"+b+";c"+c);
    }

    public static  void transVar2(){
        int a =8;
        byte b = (byte) a;
        double c = a;
        System.out.println("a:"+a+";b:"+b+";c"+c);
    }

    public static void transVar3(){
        String a = "abd";
        int b =20;
        String c = a+b;
        System.out.println(c);
    }

    //error compile
    public static void errorCompile(){
        char ascii = 98;
        System.out.println(ascii);
    }

    public static void errorCompile2(){
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1+b2);
        System.out.println(b3);
    }




}

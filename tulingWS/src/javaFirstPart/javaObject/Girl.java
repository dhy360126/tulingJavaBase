package javaFirstPart.javaObject;

public class Girl {
    private String name;
    private int age;

    public Girl(){

    }
    public Girl(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Girl girl = new Girl("黎明",30);
        System.out.println(girl.age);
    }
}

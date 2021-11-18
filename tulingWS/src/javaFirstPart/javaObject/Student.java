package javaFirstPart.javaObject;

import java.util.Map;

public class Student {
    private String name;
    private int age;
    private String sex;
    private double englishScore;
    private double mathScore;
    private double chineseScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(double chineseScore) {
        this.chineseScore = chineseScore;
    }

    public Student(){
        System.out.println("这是无参构造函数");
    }
    public Student(double englishScore,double chineseScore,double mathScore){
        this.englishScore = englishScore;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
    }
    public static double getSumScore(Student student){
        double sumScore = student.getChineseScore()+student.getEnglishScore()+student.getMathScore();
        return sumScore;

    }

    public static  double getAverageScore(Student student){
        double averageScore = getSumScore(student)/3;
        return averageScore;
    }

    public static void main(String[] args) {
        Student student1 = new Student(93,89,90);
        Student student2 = new Student(92,80,89);
        Student student3 = new Student(98,88,96);
        System.out.println(getSumScore(student1));
        System.out.println(getAverageScore(student2));
    }
}

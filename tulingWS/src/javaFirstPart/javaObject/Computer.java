package javaFirstPart.javaObject;

public class Computer {
    private String model;//型号

    private String clolor;//颜色

    private double size;//尺寸

    private double memory;//内存

    private double price;//价格

    private double weight;//重量

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getClolor() {
        return clolor;
    }

    public void setClolor(String clolor) {
        this.clolor = clolor;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //有参构造函数
    public  Computer(double price,double size){
        this.price = price;
        this.size = size;
    }
    //无参构造函数
    public  Computer(){

    }
}

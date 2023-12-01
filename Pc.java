package com.hspedu.encap;
//编写PC子类，继承Computer类，添加特有属性【品牌brand】
public class Pc extends Computer{
    private String brand;
    public Pc(String cpu, int memory, int disk ,String brand) {
        super(cpu, memory, disk );
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("pc信息=");
        //调用父类方法
        System.out.println(new StringBuilder().append(getDetails()).append("brand=").append(brand).toString());
    }
}

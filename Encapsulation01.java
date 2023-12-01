package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[]args){
        Person person = new Person();
        person.setName("jack");
        person.setAge(3000);
        person.setSalary(10000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        new Person("smith", 2000, 50000);

    }
    }


//要求 不能随便查看人的年龄，工资等隐私，并且对设置年龄进行合理年龄
// 必须在1 - 120 年龄 工资 不能直接查看 name的长度 在 2- 6 字符之间

class Person {
    public String name;//名字公开
    private int age;//私有化
    private double salary;//私有化

    public Person() {
    }

    //构造器
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对 需要（2-6）个字符，默认名字");
            this.name = "无名人";
        }
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1 - 120之间请重新输入");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String info() {
        return "信息为name=" + name + "age=" + age + "薪水=" + salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}

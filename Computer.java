package com.hspedu.encap;

public class Computer {
    //包含CPU、内存、硬盘等属性，getDetails方法用于返回
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu ,int memory, int disk){
        this.cpu = cpu;
        this.disk = disk;
        this.memory = memory;
    }
    //返回Computer信息
    public String getDetails(){
        return "cpu= " + cpu + "memory =" + memory + "diSk=" + disk;
    }


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}

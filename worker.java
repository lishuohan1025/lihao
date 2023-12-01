package duotai01;

public class worker extends Empoyee {
    public worker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("普通员工" + getName() + "is working");

    }

    @Override
    public double getAnnual() {//因为普通员工没有其他的收入 则直接调用父类方法
        return super.getAnnual();
    }
}

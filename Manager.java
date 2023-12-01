package duotai01;

public class Manager extends Empoyee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println("经理" + getName() + "is managing");
    }
    //重新获取年薪的方法
    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}

package duotai;

public class teacher extends duotai01{
    private double sle;

    public teacher(String name, int age, double sle) {
        super(name, age);
        this.sle = sle;
    }

    public double getSle() {
        return sle;
    }

    public void setSle(double sle) {
        this.sle = sle;
    }

    @Override
    public String say() {
        return super.say() + "薪水" + sle;
    }
}

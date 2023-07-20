

public class test {
    public static void main(String[] args) {
        //某人有100000元 每经过一次路口，需要缴费
        //当现金>50000时 每次交%5
        //当现金<=50000时 每次交1000
        //要求计算该人可以经过多少次路口

        int num = 0;
        double j = 100000;

        while (true) {
            if (j > 50000) {//过路口
                j *= 0.95;//过了这个路口后还有这多钱。
                num++;
            } else if (j >= 1000) {
                j -= 1000;
                num++;
            } else {//钱不够
                break;
            }
        }

        System.out.println(j + " 可以经过 " + num + " 路口");
    }
}

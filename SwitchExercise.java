import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入a-e");
        
        char c1 = myScanner.next().charAt(0);
        
        switch(c1) {
            case 'a' :
                System.out.println("A");
                break;
            case 'b' :
                System.out.println("B");
                break;
            case 'c' :
                System.out.println("C");
                break;
            case 'd' :
                System.out.println("D");
                break;
            case 'e' :
                System.out.println("E");
                break;
            default:
                System.out.println("other");
        }
        
        System.out.println("退出了SwitchExercise.java");
        
        double score = 88.5;
        
        if (score >= 0 && score <= 100) {
            switch ((int)(score/60)) {
                case 0:
                    System.out.println("不及格");
                    break;
                case 1:
                    System.out.println("合格");
                    break;
                default:
                    System.out.println("输入有误");
            }
        } else {
            System.out.println("输入的成绩在0-100之间");
        }
    }
}

import java.util.Random;
import java.util.Scanner;
public class GuessNumberEX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        biaoqian:
        while (true) {
            int low = 1;
            int high = 100;
            int g;
            int i = 0;
            Random ran = new Random();
            int n = ran.nextInt(low, high + 1);
            System.out.println("当前范围：[" + low + "]~[" + high + "]。输入你要猜的数字：");
            while (true) {
                g = scan.nextInt();
                if (g < low || g > high) {
                    System.out.println("hyw。重新输：");
                } else if (g < n) {
                    i += 1;
                    low = g + 1;
                    System.out.println("猜小了！当前范围：[" + low + "]~[" + high + "]。你已猜了" + i + "次。输入你要猜的数字：");
                } else if (g > n) {
                    i += 1;
                    high = g - 1;
                    System.out.println("猜大了！当前范围：[" + low + "]~[" + high + "]。你已猜了" + i + "次。输入你要猜的数字：");
                } else {
                    i += 1;
                    System.out.println("恭喜你猜对了！你总共猜了" + i + "次。");
                    break;
                }
            }
            scan.nextLine();
            System.out.println("是否继续？继续就输入Y，不继续就输入N。");
            while(true){
                String $=scan.nextLine();
                if ($.equals("Y")||$.equals("y")){
                    break;
                }else if($.equals("N")||$.equals("n")){
                    break biaoqian;
                }else{
                    System.out.println("我丢雷老某，重新输：");
                }
            }
        }
        System.out.println("白白~");
        scan.close();
    }
}
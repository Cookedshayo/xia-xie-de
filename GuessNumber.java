import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] args){
        Random random = new Random();
        int number = random.nextInt(100)+1;
        Scanner scan = new Scanner(System.in);
        System.out.println("输入你有多少次机会猜这个数：");
        int i = scan.nextInt();
        while (i<=0){
            System.out.println("何意味。重新输：");
            i = scan.nextInt();
        }
        System.out.println("你有"+i+"次机会，输入要猜的数（1~100之中的数）：");
        int guess = scan.nextInt();
        i-=1;
        while (i!=0){
            if (guess>number){
                System.out.println("猜大了！再猜一遍（剩余机会："+i+"次）：");
                guess = scan.nextInt();
                i-=1;
            } else if(guess<number){
                System.out.println("猜小了！再猜一遍（剩余机会："+i+"次）：");
                guess = scan.nextInt();
                i-=1;
            }else{
                System.out.println("恭喜你猜对了！哦齁齁齁齁齁齁齁齁");
                break;
            }
        }
        if (i==0){
            System.out.println("免费观看次数已用完。杂口~");
        }
        scan.close();
    }
}

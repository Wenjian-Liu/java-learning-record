package GPT;
import java.util.*;

public class TheBiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数字：");
        int n1 = scanner.nextInt();

        System.out.print("请输入第二个数字：");
        int n2 = scanner.nextInt();

        System.out.print("请输入第三个数字：");
        int n3 = scanner.nextInt();

        int max = n1;
        if (n2 >max) {
            max = n2;
        }
        if (n3 >max) {
            max = n3;
        }

        System.out.println("最大的数字是：" + max);

        scanner.close();
    }
}

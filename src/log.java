//算法练习1.1.14

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

class log {

    @Contract(pure = true)
    private static int lg(int num) {
        long j = 1;
        int i = 0;
        while (j < num) {
            j = j * 2;
            i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        System.out.printf("输入一个整数N，你将得到一个不大于log(2)N的最大整数:");
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        int result = lg(N);
        System.out.printf("你得到的结果是：%d", result);
    }
}

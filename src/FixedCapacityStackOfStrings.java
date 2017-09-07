//创建一个定容栈，然后通过命令来操作入栈、出栈或打印栈头文件

import java.util.Scanner;

public class FixedCapacityStackOfStrings {
    private String[] s;
    private int n = 0;

    private FixedCapacityStackOfStrings(int cap) {
        s = new String[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    private void push() {
        System.out.printf("输入一个入栈的单词：");
        Scanner word = new Scanner(System.in);
        String item = word.next();
        s[n++] = item + ' ';
    }

    private void pop() {
        --n;
    }

    private void stackPrinter() {
        System.out.print(s[n - 1]);
    }

    public static void main(String[] args) {
        System.out.printf("输入一个整数，用来创建定容栈：");
        Scanner num = new Scanner(System.in);
        int cap = num.nextInt();
        FixedCapacityStackOfStrings stackTest = new FixedCapacityStackOfStrings(cap);
        System.out.printf("输入指令：\"push\"入栈，\"pop\"出栈，\"print\"查看栈顶元素，\"exit\"退出：");
        while (true) {
            Scanner word = new Scanner(System.in);
            String order = word.next();
            switch (order) {
                case "push":
                    stackTest.push();
                    break;
                case "pop":
                    stackTest.pop();
                    break;
                case "print":
                    stackTest.stackPrinter();
                    break;
                case "exit":
                    return;
                default:
                    System.out.printf("输入有误。请重新输入:");
            }
            System.out.printf("继续输入命令：");
        }
    }
}

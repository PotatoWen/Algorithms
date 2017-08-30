
//《算法》练习1.1.13题目

import edu.princeton.cs.algs4.StdRandom;

public class ZhuanZhi {
    public static void main(String args[]){

        int M = StdRandom.uniform(10,20);
        int N = StdRandom.uniform(10,20);
        double[][] num = new double[M][N];
        for (int i =0;i<M;i++) {
            for (int j=0;j<N;j++) {
                num[i][j] = StdRandom.uniform(100.0, 200.0);
            }
        }

        for (int i=0;i<M;i++) {
            for (int j=0;j<N;j++) {
                System.out.printf("%4.2f"+" ",num[i][j]);
            }
            System.out.print('\n');
        }

        System.out.printf("二维数组的长宽是: %d,%d \n",M,N);

        for (int i=0;i<N;i++) {
            for (int j=0;j<M;j++) {
                System.out.printf("%5.2f"+" ",num[j][i]);
            }
            System.out.print('\n');
        }
    }
}

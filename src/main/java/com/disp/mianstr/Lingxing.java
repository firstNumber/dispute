package com.disp.mianstr;

import java.util.Scanner;

/**
 * @author liyongzhen
 * @create 2019-06-03 10:23
 **/
public class Lingxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //代表菱形的行数
        int n;
        //判断是否有效
        do {
            System.out.println("请输入菱形的行数：");
            n = sc.nextInt();
        } while (n % 2 == 0 || n <= 0);

        int m = (n - 1) / 2;

        for (int i = -m; i <= m; i++) {
            for (int j = -m; j <= m; j++) {
                //当<=变成==是就变成了一个空心菱形
                if (Math.abs(j) + Math.abs(i) <= Math.abs(m)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }


    public static void starsUp() {
        int j;
        for (int m = 1; m <= 4; m++) {

        }
    }
}

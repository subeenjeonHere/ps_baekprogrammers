package baek_joon.class_1;

import java.io.BufferedReader;
import java.util.Scanner;

public class 별찍기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
//                sb.append("*");
            }
            System.out.println();
//            sb.delete(0, sb.length());
        }
    }
}

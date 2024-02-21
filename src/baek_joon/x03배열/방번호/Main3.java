package baek_joon.x03배열.방번호;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String size = sc.nextLine();
        int[] arr = new int[size.length()];
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(size.charAt(i)));
            count[arr[i]]++;
        }
        System.out.println("카운트" + Arrays.toString(count));
        //최댓값
        int maxval = 0;
        int sum = 0;

        for (int k = 0; k < count.length; k++) {
            if (k != 6 && k != 9) {
                maxval = Math.max(count[k], maxval);
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 6 || arr[j] == 9) {
                sum++;
            }
        }

        int result = 0;
        // 6 9 개수 판단
        if (sum % 2 == 0) {
            result = sum / 2;
        } else {
            result = sum / 2 + 1;
        }
        int answer = Math.max(result, maxval);
        System.out.println(answer);
    }
}

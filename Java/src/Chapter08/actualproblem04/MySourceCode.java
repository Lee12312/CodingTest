package Chapter08.actualproblem04;

import java.util.*;

public class MySourceCode {

    public static int[] arr = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //가로의 길이 n 을 입력받기
        int n = sc.nextInt();
        //배열 초기화
        arr[1] = 1;
        arr[2] = 3;
        //다이나믹 프로그래밍 수행
        for(int i = 3; i <= n; i++){
            arr[i] = (arr[i-1] + 2*arr[i-2]) % 796796;
        }

        System.out.println("result = "  + arr[n]);
    }

}

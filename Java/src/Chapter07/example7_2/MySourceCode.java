package Chapter07.example7_2;

import java.util.*;

public class MySourceCode {

    public static int binarySearch(int[] arr, int target, int start, int end){
        //찾는 원소가 없을 경우 종료
        if(start > end) return -1;
        //중간 인덱스
        int mid = (end - 1) / 2;
        //이진 탐색 시작
        if(target == arr[mid]) return mid;
        else if(target > arr[mid]) return binarySearch(arr, target, mid + 1, end);
        else return binarySearch(arr, target, start, mid - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //원소의 갯수 입력받기
        int n = sc.nextInt();

        int[] arr = new int[n];

        //찾을 숫자 입력받기
        int target = sc.nextInt();
        //원소 입력받기
        for(int i = 0; i < n; i++){
             arr[i] = sc.nextInt();
        }
        //배열 정렬
        Arrays.sort(arr);

        int result = binarySearch(arr, target, 0, n-1);

        System.out.println("result = " + result);

    }

}

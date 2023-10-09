package search;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int[] arr = {1,2,3,5,8,9,6,7,0} ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Arrays.sort(arr);
        while (true) {
            System.out.println("Nhap vao so tim kiem ");
            int search = sc.nextInt();
            binaryySearch(search) ;
        }
    }
    public static void binaryySearch(int seacrch) {
        int low = 0 ;
        int high = arr.length -1 ;
        int mid ;
        while (high >=   low) {
            mid = ( high + low ) / 2 ;
            if (seacrch == mid) {
                System.out.println("phan tu co ton tai trong danh sach");
                return;
            } else if (seacrch < arr[mid]) {
                high = mid -1 ;

            } else {
                low = mid + 1 ;
            }
        }
        System.out.println("Phan tu tim kiem khong co trong mang ");
    }
}

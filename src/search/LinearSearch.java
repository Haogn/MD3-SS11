package search;

import java.util.Scanner;

public class LinearSearch {
    public static int[] arr = {1,2,3,5,78,44,22} ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap vao so can tim kiem ");
        int search = sc.nextInt() ;
        linearSeach(search) ;
    }

    private  static void  linearSeach(int search) {
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == search) {
                System.out.println("Phan tu can tim o vi tri thu " + i );
                return;
            }
        }
        System.out.println("Khong ton tai " + search);
    }
}

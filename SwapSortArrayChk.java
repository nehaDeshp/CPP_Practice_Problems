package arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SwapSortArrayChk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        boolean canSwap = false;
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            canSwap = swapSort(a);
            if(canSwap)
            	System.out.println("Yes");
            else
            	System.out.println("No");
        }
    }
    public static boolean swapSort(int a[]){
    		for(int i=0;i<a.length-1;i++){
                if(a[i]-a[i+1] == 1 || a[i]-a[i+1] == -1 ){
                    int tmp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=tmp;
                }
            }

            if(chkSorted(a))
            	return true;
            return false;
    }
    public static boolean chkSorted(int a[]){
            boolean sort = true;
            for(int i=0;i<a.length-1;i++){
                if(a[i]>a[i+1]){
                    sort = false;
                }
            }
            return sort;
        }
    }

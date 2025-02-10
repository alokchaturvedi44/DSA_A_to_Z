
/* Problem Link
https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array */

import java.util.*;
public class Q_1{
    public static int largest(int[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i : arr){
            max = Math.max(max, i);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 7, 56, 90};
        System.out.println("Largest element is: " + largest(arr));
    }
}
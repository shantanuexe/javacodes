package recursion;

import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        boolean ans=checkSortedBetter(arr);
        System.out.println(ans);

    }

    public static boolean checkSortedBetter(int arr[]){

        return checkSortedBetterwithIndex(arr,0);
    }

    private static boolean checkSortedBetterwithIndex(int[] arr, int startindex) {
        if(startindex>=arr.length-1){
            return true;
        }
        if(arr[startindex]> arr[startindex+1]){
            return false;
        }
        return checkSortedBetterwithIndex(arr,startindex+1);

    }


    private static boolean checkSorted(int arr[]){

        if(arr.length<=1){
            return true;
        }

        int smallArr[]= new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallArr[i-1]=arr[i];
        }
       boolean smallAns= checkSorted(smallArr);

        if(!smallAns){
            return false;
        }
       if(arr[0]<=arr[1]){
           return true;
       }

        return false;
    }
}

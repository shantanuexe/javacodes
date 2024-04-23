package recursion;

import java.util.Scanner;

public class Fibbonaci {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int ans= fibb(n);
        printFib(n);
        System.out.println("nth fib");
        System.out.println(ans);
    }
    private static int fibb(int n){
     if(n==0 || n==1){
         return n;
     }
        return fibb(n-1)+ fibb(n-2);
    }

    private static void printFib(int n){
        if(n<0){
            return;
        }
        int fib_0=0;
       int  fib_1=1;
        for(int i=0;i<n;i++){
            System.out.println(fib_0);
            int temp= fib_0+fib_1;
            fib_0=fib_1;
            fib_1=temp;


        }


    }
}

package PrefixSum;

import java.util.Scanner;

public class PascalTriangle {
     public static void display(int [] [] arr){
        for(int[] a:arr){
            for(int i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static int [][] pascal(int n){
        int [][] ans=new int [n][];
        for(int i=0;i<n;i++){
            ans[i]=new int[i+1];
            //1st and last element of every row is 1
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }

        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the no of rows of pascal triangle:");
        int a=sc.nextInt();
        System.out.println("your pascal triangle:");
        display(pascal(a));
        sc.close();
    }
}

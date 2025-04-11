package PrefixSum;

public class Matrix {
    static void add(int[][] a,int r1,int c1,int[][] b,int r2,int c2 ){
        int [][] sum=new int[r1][c2];
        if(r1!=r2 || c1!=c2){
            System.out.println("wrong    ");
            return;
        }
        
        else{
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    sum[i][j]=a[i][j]+b[i][j];
                    System.out.print(sum[i][j]+"  ");
                }
                System.out.println();
            }

        }
    }
    public static void main(String[] args) {
        int [][] a={
            {1,2,3},
            {2,4,5},
            {1,2,3}
        };
        int [][] b={
            {1,2,6},
            {2,2,5},
            {1,9,3}
        };
        add(a,3,3,b,3,3);
    }
}

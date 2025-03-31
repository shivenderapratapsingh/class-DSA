package BinarySearch;

public class twodmat {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int st=0, end=n*m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midelt=matrix[mid/m][mid%m];
            if(midelt==target) return true;
            if(target<midelt){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;

        
    }
    
}

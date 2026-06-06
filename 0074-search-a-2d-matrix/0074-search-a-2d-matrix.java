class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length;
        int m=matrix.length;
        int low=0;
        int high=m*n-1;
        while(low<=high)
        {
            int mid=(high+low)/2;
            int r=mid/n;
            int c=mid%n;
            int element=matrix[r][c];
            if(element==target)
            {
                return true;
            }
            else if(element>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return false;
    }
}
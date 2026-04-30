class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int x[]=new int[2];
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++){
        //     if(nums[i]+nums[j]==target)
        //     {
        //         x[0]=i;
        //         x[1]=j;
        //         return x;
        //     }
        //     }
        // }
        // return x;
        int x[]=new int[2];
        int j=0;
        while(x[0]==0 && x[1]==0)
        {
            j++;
            for(int i=0;i<nums.length-j;i++)
            {
                if(nums[i]+nums[i+j]==target)
                {
                    x[0]=i;
                    x[1]=i+j;
                }
            }
        }
        return x;
    }
}
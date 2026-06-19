class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
;

            if ( numbers[l] + numbers[r] == target) {
                return new int[]{l + 1, r + 1};
            }
            else if ( numbers[l] + numbers[r] < target) {
                l++;
            }
            else {
                r--;
            }
        }

        return new int[]{};
    }
    //    int ans[] = new int[2];
    //     int j = 0;
    //     while(ans[0]==0&&ans[1]==0)
    //     {
    //         j++;
    //         for(int i=0;i<numbers.length-j;i++)
    //         {
    //             if(numbers[i]+numbers[i+j]==target)
    //              {
    //                 ans[0]=i+1;
    //                 ans[1]=i+j+1;
    //             }
    //         }
    //     }
    //     return ans;

}
   
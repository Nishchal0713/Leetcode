class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            if(hm.containsKey(n))
            {
                int prev=hm.get(n);
                hm.put(n,prev+1);
            }
            else
            {
                hm.put(n,1);
            }
        }
        for(int i: hm.keySet())
        {
            if(hm.get(i)>nums.length/2)
            {
                return i;
            }
        }
        return -1;
    }
}
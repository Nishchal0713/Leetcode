class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                int prev=hm.get(nums[i]);
                hm.put(nums[i],prev+1);
            }
            else
            {
                hm.put(nums[i],1);
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
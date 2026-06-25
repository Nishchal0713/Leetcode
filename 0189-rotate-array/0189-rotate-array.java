class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        int arr[] = new int[nums.length];
        int y = 0;

        for(int i = nums.length - k; i < nums.length; i++) {
            arr[y++] = nums[i];
        }

        for(int i = 0; i < nums.length - k; i++) {
            arr[y++] = nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }
}
int removeDuplicates(int* nums, int numsSize) {
    
    int constant = 0;
    for (int i = 1; i < numsSize; i++) {
        if (nums[i] != nums[constant]) {
            constant++;
            nums[constant] = nums[i];
        }
    }
     return constant+1;
}
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;

        while(i < nums.length && j <nums.length){
            if(nums[i] != 0){
                i++;
            }else if(nums[j] == 0){
                j++;
            }else if(j<i){
                j = i+1;
            }else{
                nums[i++] = nums[j];
                nums[j++] = 0;
            }
        }
    }
}
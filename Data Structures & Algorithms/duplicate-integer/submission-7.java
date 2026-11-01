class Solution {
    public boolean hasDuplicate(int[] nums) {
        //select element of array
        for(int i=0;i<nums.length;i++){
            //check whether it appears again
            for(int j=i+1;j<nums.length;j++){
                //check whether it match.
                if(nums[i]==nums[j]){
                    //duplicate found
                    return true;
                }
            }
        }
        //no duplicates
        return false;
    }
}
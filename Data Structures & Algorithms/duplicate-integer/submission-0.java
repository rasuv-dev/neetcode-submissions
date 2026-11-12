class Solution {
    public boolean hasDuplicate(int[] nums) {
        //to store the seen element
        HashSet visited = new HashSet<>();

        //traverse the array
        for(int i = 0;i<nums.length;i++){
            // If it already seen return true
            if(visited.contains(nums[i])){
                // whenever the element is already seen return true
                return true;
            }else{
                visited.add(nums[i]);
            }
        }


        // whenever the their is no duplicate returns false
        return false;   
    }
}
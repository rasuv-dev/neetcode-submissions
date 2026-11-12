class Solution {
    public int[] twoSum(int[] nums, int target) {

        //map to store the visited element and its index
        Map<Integer,Integer> visited = new HashMap<>();

        //iterate through each element
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            //calculate the complement
            int complement = target - num;
            //check whether complement is exists in map
            if(visited.containsKey(complement)){
                return new int[]{visited.get(complement),i};
            }else{
                //add the current element with its index
                visited.put(num,i);
            }
        }
        
        //their is no such pair whoes sum is equal to target
        return new int[]{-1,-1};
    }
}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        //store the checked elements in set
        Set<Integer> set = new HashSet<Integer>();

        //add each element one by one in set
        for(int num:nums){
            //check is already has in set or not
            if(set.contains(num)){
                return true;
            }

            //element not present in set so add it
            set.add(num);
            
        }

        return false;

    }
}
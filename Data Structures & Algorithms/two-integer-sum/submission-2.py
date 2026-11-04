class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        #use the map to store the visited elements and its indices
        visited = {}

        #iterate through the nums
        for i in range(0,len(nums)):
            num = nums[i]
            #calcuate the complement(find the number needed to to add to the current number to reach the target)
            complement = target - num

            #check whether the needed number is exists in map
            if complement in visited:
                #needed number is exists in map
                #return the indices of two numbers
                return [visited.get(complement), i]
            else:
                # add current number for future lookups
                visited[num] = i
        #numbers not exists in nums whose sum is equal to target
        return []                            

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        # take each element of nums
        for i in range(0, len(nums)):
            num1 = nums[i]

            # add it to all other elements after it
            for j in range(i + 1, len(nums)):
                num2 = nums[j]
                # add the two numbers
                sum = num1 + num2

                #compare sum to target
                if sum == target:
                    #return the index of elements whose sum is equal to target
                    return [i, j]
        return []

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # Dictionary to store the frequency of each unique number
        freq = {}

        # Calculate the frequency of each unique number
        for num in nums:
            freq[num] = freq.get(num,0)+1

        #length of the list
        n = len(nums)    

        # Create the n+1 buckets
        # Each bucket represents the frequency of number
        buckets = [[] for _ in range(n+1)] 

        # Place the each unqiue element into the bucket corresponding to its frequency
        for num,cnt in freq.items():
            buckets[cnt].append(num)

        # index of the bucket
        currentBucket = n

        #store the final k elements
        res = []
        # Traverse from the high frequency elements buckets towards the least frequency elements buckets
        while(currentBucket>=0 and len(res)<k):
            for element in buckets[currentBucket]:
                res.append(element)
                if len(res) == k:
                    break
            currentBucket -=1

        #return the most frequent k elements
        return res


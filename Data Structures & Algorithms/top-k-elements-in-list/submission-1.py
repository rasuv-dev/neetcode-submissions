class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        # store the freq of the element
        count = {}

        for num in nums:
            count[num] = count.get(num, 0) + 1

        # create the heap

        heap = []

        for num,freq in count.items():
            heapq.heappush(heap,(count[num],num))
            if len(heap)>k:
                heapq.heappop(heap)


        res = []

        for i in range(0,k):
            res.append(heap[i][1])

        return res
        


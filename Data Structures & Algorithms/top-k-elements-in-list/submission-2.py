class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        # map to count the frerquency of each unqiue element

        freq = {}

        # count the frequency
        for num in nums:
            freq[num] = freq.get(num, 0) + 1

        #create an array for heap
        heap = []

        #take each pair form the freq map
        for num, count in freq.items():
            #insert the count of the freqnecy as well as num
            heapq.heappush(heap,[count,num])
            #if length of heap exceeds k pop the smallest element
            if len(heap)> k:
                heapq.heappop(heap)


        #take the elements from the heap to return
        res = [val[1] for val in heap]

        #finally return the most frequents numbers
        return res

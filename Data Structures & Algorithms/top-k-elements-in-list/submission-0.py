class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # disctionary to store the number frequency.
        count = {}

        #count the freq of each number
        for num in nums:
            # if num missing add with frq 1 else increment freq by one.
            count[num] = 1 + count.get(num, 0)


        freq_list = []

        for num, freq in count.items():
            freq_list.append([freq,num])

        freq_list.sort()

        res = []

        while len(res) < k:
            res.append(freq_list.pop()[1])

        return res



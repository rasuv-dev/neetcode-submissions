class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

      groups = defaultdict(list)

      

      for word in strs:
        freq_counter = [0]*26
        
        for char in word:
            freq_counter[(ord(char)-ord('a'))]+=1;

        groups[tuple(freq_counter)].append(word)


      return list(groups.values())      

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s1,s2 = defaultdict(lambda : 0),defaultdict(lambda: 0)
        
        for char in s:
            s1[char] += 1
        for char in t:
            s2[char] += 1

        return s1 == s2
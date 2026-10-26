class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if s is None or t is None:
            return False
        if len(s) != len(t):
            return False

        count = [0] * 26
        for char in s:
            count[ord(char) - ord("a")] += 1
        for char in t:
            count[ord(char) - ord("a")] -= 1

        for value in count:
            if value != 0:
                return False
        return True

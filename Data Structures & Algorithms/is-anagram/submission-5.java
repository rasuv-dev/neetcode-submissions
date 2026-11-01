class Solution {
    public boolean isAnagram(String s, String t) {
        // the strings with different length cannot be anagram.
        if (s.length() != t.length()) {
            return false;
        }

        // two hashmaps to count the frequency of each charater in both strings
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        // count the frequency of each charater in both srings
        for (int i = 0; i < s.length(); i++) {
            //count of s charater
            sCount.put(s.charAt(i),sCount.getOrDefault(s.charAt(i), 0) + 1);

            //count of t charater
            tCount.put(t.charAt(i),tCount.getOrDefault(t.charAt(i), 0) + 1);
        }

        //compare the both maps are equal
        return sCount.equals(tCount);
    }
}

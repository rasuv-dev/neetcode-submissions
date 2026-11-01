class Solution {
    public boolean isAnagram(String s, String t) {
        //the strings with different length cannot be anagram.
        if(s.length() != t.length()){
            return false;
        }
        
        //convert Strings to charater array so sorting can be cone.
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        //sort the arrays to check whether the strings are anagram
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        //if both are equal they are anagram,if not they not.
        return Arrays.equals(sArray,tArray);
    }
}

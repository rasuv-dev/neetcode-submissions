class Solution {
    int[] letters = new int[26];
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        //convert s to charater array
        char[] sArray = s.toCharArray();

        //convert the c to character array
        char[] tArray = t.toCharArray();

         //increment the freq for each charater in letters array
         for(char ch : sArray){
            letters[ch-'a']++;
         }

         //decrement the fre for each charater in letter array
         for(char ch: tArray){
            letters[ch-'a']--;
         }

         for (int freq: letters){
            if (freq!=0){
                return false;
            }
         }

         return true;
    }
}

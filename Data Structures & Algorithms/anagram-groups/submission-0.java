class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //map to group anagrams based on keys
        Map<String,List<String>> res = new HashMap<>();

        //iterate through each string
        for(String str:strs){
            //convert str to char array
            char[] charArray = str.toCharArray();

            //array to represent/count freq of each charater
            int[] count = new int[26];
            //count the freq of each charater
            for(char c : charArray){
                count[c-'a']++;
            }
            //convert the count array to string so we can use it as key
            String key = Arrays.toString(count);

            //if key is not present create new entry with empty list as value
            res.putIfAbsent(key,new ArrayList<>());
            //append the current string to the list associated to this key
            res.get(key).add(str);
        }

        //return the all the lists stored in hashmap
        return new ArrayList<>(res.values());
    }
}

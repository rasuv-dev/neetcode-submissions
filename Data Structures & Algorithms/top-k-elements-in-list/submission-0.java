class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // map to count the freq of each number in array
        Map<Integer, Integer> count = new HashMap<>();

        // count the freq of each number
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // create total n buckets

        List<Integer>[] buckets = new List[nums.length + 1];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        //take each pair from hashmap
        for (Map.Entry<Integer, Integer> pair : count.entrySet()) {
            int number = pair.getKey();
            int cnt = pair.getValue();
            // put the number in bucket corresponding to its freq.
            buckets[cnt].add(number);
        }

        int[] res = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            for (int element : buckets[i]) {
                res[index++] = element;
                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}

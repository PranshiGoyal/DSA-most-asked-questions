class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : map.keySet()){
            if(map.get(num) > (n/3)){
                list.add(num);
            }
        }
        return list;
    }
}
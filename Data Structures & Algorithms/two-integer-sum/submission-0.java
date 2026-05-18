class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        int diff = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            diff = target - nums[i];
            if(!map.containsKey(diff))
                map.put(nums[i],i);
            else {
                indices[1]=i;
                indices[0]=map.get(diff);
            }
        }
        return indices;
    }
}

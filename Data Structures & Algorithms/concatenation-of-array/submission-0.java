class Solution {
    public int[] getConcatenation(int[] nums) {
        int total_length = 2 * nums.length;
        int[] concat_array = new int[total_length];
        for(int i=0;i<nums.length;i++) {
            concat_array[i]=nums[i];
            concat_array[i+nums.length]=nums[i];
        }
        return concat_array;
    }
}
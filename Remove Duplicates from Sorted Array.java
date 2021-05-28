class Solution {
    public int removeDuplicates(int[] nums) {
        int[] retal = new int[nums.length];
        int j = 0;
        for(int i = 0; i< nums.length;i++){
            int num = nums[i];
            retal[j] = num;
            while((i+1)<nums.length&&nums[i+1]==num){
                i++;
            }
            j++;
        }
        for(int i = 0; i< j; i++){
            nums[i] = retal[i];
        }
        
        return j;
    }
}
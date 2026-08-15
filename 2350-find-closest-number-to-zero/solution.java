class Solution {
    public int findClosestNumber(int[] nums) {
        int temp=nums[0];
        for(int i=0 ; i < nums.length ; i++){
            
            if(Math.abs(temp)>Math.abs(nums[i])){
                temp=nums[i];
            }
            else if (Math.abs(nums[i]) == Math.abs(temp) && nums[i] > temp) {
                temp = nums[i];
            }
        }
        return temp;
    }
}

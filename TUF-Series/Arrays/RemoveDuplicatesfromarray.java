class Solution {
    public int removeDuplicates(int[] nums) {
        int right=0;
        for( int left=1; left<nums.length ;left++){
            if(nums[left]!=nums[right]){
                nums[right+1]=nums[left];
                right=right+1;
            }
        }
        return right+1;
    }
}

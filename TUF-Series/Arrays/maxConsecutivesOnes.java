// MY soloution
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0; 
        int max=0;
        for(int i=0 ;i<nums.length;i++){
            if(nums[i]==1){
             count++;
             if(i==nums.length-1){
                max= Math.max(count,max);
             }
            }
            else {
                max= Math.max(count,max);
                count=0;
            }
        }
        return max;
    }
}

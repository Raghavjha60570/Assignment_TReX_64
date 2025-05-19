class Solution {
    public int singleNumber(int[] nums) {
        int target=0;
     for( int i=0 ; i<nums.length ;i++){
        target=nums[i];
        int count=0;
        for(int j=0 ;j<nums.length;j++){
            if(target==nums[j] && i!=j){
                count=1;
                break;

            }

        }
        if(count==0){
            break;
        }
     }
     return target;
    }
}

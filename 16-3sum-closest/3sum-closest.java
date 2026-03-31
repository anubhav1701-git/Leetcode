class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
        int n= nums.length;
        int closesum= nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;

            while(left<right){
                int totalsum=nums[i]+nums[left]+nums[right];
                if(Math.abs(totalsum-target)<Math.abs(closesum-target)){
                    closesum=totalsum;

                }
                if(totalsum<target){
                  left++;
                }
                else if(totalsum>target){
                    right--;
                }
                else{
                    return totalsum;
                }
            
            }
        }
        return closesum;
    }

}
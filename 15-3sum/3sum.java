class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultList = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int j= i+1;
            int k= nums.length-1;

            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                List<Integer> list = new ArrayList<Integer>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                resultList.add(list);
                j++;
                k--;
                
            } else if(nums[i]+nums[j]+nums[k]>0){
                k--;
            } else {
                j++;
            }
            
            }            
        }
        return new ArrayList<>(resultList);
    }
}
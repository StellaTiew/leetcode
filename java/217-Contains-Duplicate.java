class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> prevHash = new HashSet<>();
        
        for(int i =0; i< nums.length; i++){
            if(prevHash.contains(nums[i])){
                return true;
            }
            
            prevHash.add(nums[i]);
        }
        
        return false;
    }
}

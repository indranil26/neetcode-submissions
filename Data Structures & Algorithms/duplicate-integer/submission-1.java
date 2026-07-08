class Solution {
    public boolean hasDuplicate(int[] nums) {
        
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j]) return true;
    //         }
    //     }
    //     return false;
    
    Map<Integer, Integer> freq=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        if(freq.get(nums[i])>1) return true;
    }
    return false;

    }
}
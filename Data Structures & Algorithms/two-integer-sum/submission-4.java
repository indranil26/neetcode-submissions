class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
    //   for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]+nums[j]==target){
    //             res[0]=i;
    //             res[1]=j;
    //             return res;
    //         }
    //     }
    //   }  

      Map<Integer, Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],i);
      }

      for(int i=0;i<nums.length;i++){
        if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
           res[0]=i;
           res[1]=map.get(target-nums[i]);
        }
        if(res[0]>res[1]){
            int temp=res[0];
            res[0]=res[1];
            res[1]=temp;
        }
      }
      return res;
    }
}

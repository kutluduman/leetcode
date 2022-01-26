// this solution is not good time complexity was. If the data increases this will increase too. So this is contant, but we want linear, therefore this solution is not the best approach
class Solution {
  public int[] twoSum(int[] nums, target) {
    for(int i=0 ; i<nums.length ; i++) {
      for(int j=i+1 ; j<nums.length ; j++){
         int complement = target - nums[i];

         if(nums[j] == complement) {
           return new int[] {i,j};
         }
      }
    }
    throw new IllegalArgumentException("No Match Found");
  }
}



// this is the linear time complexity solution. We will come up with HashMap because it has linear runtime. Array wouldn't be linear because you would be constantly looking at it. We store things and pull in constant time.

class Solution {
  public int[] twoSum(int[] nums, target) {
    Map<Integer, Integer> num_map = new HashMap<>();
    
    for(int i = 0 ; i<nums.length ; i++) {
      complement = target - nums[i];
      if(num_map.containsKey(complement)){
        return new int[] {num_map.get(complement),i};
      }
      num_map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No match found");
  }
}
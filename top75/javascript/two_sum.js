// we use hear map as well to have linear runtime and to decrease the runtime time complexity.
const twoSum = (nums, target) => {
  let map = new Map();
  for (let i=0 ; i< nums.length ; i++) {
    let complement = target - nums[i];
    if(map.has(complement)){
      return [i, map.get(complement)];
    }
    map.set(nums[i], i);
  }
}
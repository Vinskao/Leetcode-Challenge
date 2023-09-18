var twoSum = function(nums, target) {
    let indices = {};

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (indices[complement] !== undefined) {
            return [indices[complement], i];




const nums = [2, 7, 11, 15];
const target = 9;
const result = twoSum(nums, target);
console.log(result);
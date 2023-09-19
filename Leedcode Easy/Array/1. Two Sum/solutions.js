var twoSum = function(nums, target) {
    const numIndices = {};

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (numIndices[complement] !== undefined) {
            return [numIndices[complement], i]
        } 
        
        numIndices[nums[i]] = i; // 將當前數字的索引儲存到 numIndices
    }
    return [];
}
    



const nums = [2, 7, 11, 15];
const target = 9;
const result = twoSum(nums, target);
console.log(result);

const nums1 = [3, 2, 4];
const target1 = 6;
const result1 = twoSum(nums1, target1);
console.log(result1);

const nums2 = [3, 3];
const target2 = 6;
const result2 = twoSum(nums2, target2);
console.log(result2);
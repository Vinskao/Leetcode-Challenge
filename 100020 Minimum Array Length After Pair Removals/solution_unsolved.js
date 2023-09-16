/**
 * @param {number[]} nums
 * @return {number}
 */
var minOperations = function(nums) {
    const n = nums.length;
    if (n < 2) {
        return 0;
    }

    let operations = 0;
    let i = 0;

    while (i < n - 1) {
        if (nums[i] < nums[i + 1]) {
            i++; // 如果当前元素小于下一个元素，直接跳到下一个元素
        } else {
            let j = i + 1;
            while (j < n && nums[i] >= nums[j]) {
                j++; // 找到第一个大于当前元素的位置
            }

            const removeCount = j - i;
            operations += removeCount; // 计算移除的元素个数
            nums.splice(i, removeCount); // 移除这些元素
        }
    }

    return operations;
};

console.log(minOperations([1, 3, 4, 9])); 
console.log(minOperations([2, 3, 6, 9])); 
console.log(minOperations([1, 1, 2]));  

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var sumIndicesWithKSetBits = function(nums, k) {
    // 计算一个整数的二进制表示中有多少个1
    function countSetBits(num) {
      let count = 0;
      while (num > 0) {
        count += num & 1; //当执行 num & 1 时，它会将 num 的二进制表示和 0001进行按位与运算。
        num >>= 1;
      }
      return count;
    }
  
    let result = 0;
  
    for (let i = 0; i < nums.length; i++) {
      // 检查当前索引的二进制表示中1的数量是否等于k
      if (countSetBits(i) === k) {
        result += nums[i]; // 如果是，将对应的元素值添加到结果中
      }
    }
  
    return result; // 返回最终结果
  };
  
  
  
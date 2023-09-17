/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumRightShifts = function(nums) {
    const n = nums.length;

    // 辅助函数：检查数组是否已排序
    function isSorted(arr) {
        for (let i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // 用于存储每种右移次数下的排序结果
    const sortedArrays = [];

    // 从 0 到 n-1 个右移次数进行遍历
    for (let shifts = 0; shifts < n; shifts++) {
        // 复制原始数组
        const sortedArray = [...nums];

        // 执行右移操作
        for (let i = 0; i < shifts; i++) {
            const temp = sortedArray[n - 1];
            for (let j = n - 1; j > 0; j--) {
                sortedArray[j] = sortedArray[j - 1];
            }
            sortedArray[0] = temp;
        }

        // 将排序后的数组存储在数组中
        sortedArrays.push(sortedArray);
    }

    // 查找已排序数组中的位置
    const sortedIndex = sortedArrays.findIndex(isSorted);

    // 如果找到已排序数组，则返回右移次数，否则返回 -1
    return sortedIndex !== -1 ? sortedIndex : -1;
};

/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let j = m-1;
    let i = n-1;
    let k = m + n-1;

    while (i >= 0 && j >= 0) {
        if (nums1[j] > nums2[i]) { //對於nums1數組比nums2大的部分
            nums1[k] = nums1[j] //將nums1元素放入合併組中，從index=k開始放
            j--; //一個個往前放
        } else { //對於nums1數組沒有比nums2大的部分(nums2>=nums1的部分)
            nums1[k] = nums2[i] ///將nums2元素放入合併組中，從index=k開始放
            i--; //一個個往前放
        }
        k--; //每次處理完if或else時，k會往前順位，以供新的元素填入，起始值k = m + n-1
        //nums1小於nums2的元素会继续保留在合并后的 nums1 数组中的正确位置。
    }

    while (i >= 0){
        nums1[k] = nums2[i]; //先放入剩餘所有num2，上個while會遺留abs(m-n)個元素，包含nums1、nums2(所有num2>所有nums1)，因為先遍歷num1，所以不包含比num2大的num1
        i--;
        k--; 
    } //剩下就是不需排列的最小的num1
};

console.log(merge);

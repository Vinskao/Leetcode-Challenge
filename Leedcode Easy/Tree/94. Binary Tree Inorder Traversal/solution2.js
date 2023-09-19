/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
    let ans = [];

    function traverse(node) {
        if (node !== null) {
            traverse(node.left);
            ans.push(node.val); // 紀錄最左邊節點的值
            traverse(node.right);
        }
    }

    traverse(root);
    return ans;
}

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
    let stack = [];
    let currentNode = root;

    while (currentNode || stack.length > 0) { //直到 currentNode 变为 null或stack還有Node
        while (currentNode){  //直到 currentNode 变为 null，也就是当前节点没有左子节点为止。
            stack.push(currentNode);
            currentNode = currentNode.left //如果 currentNode 没有左子节点则 currentNode 将变为 null
        }

        currentNode = stack.pop(); //从stack中弹出最後一个节点-当前子树的根节点入currentNode

        ans.push(currentNode); //将弹出的节点的值添加到ans

        currentNode = currentNode.right; //将 currentNode 更新为当前节点的右子节点
    } 
}

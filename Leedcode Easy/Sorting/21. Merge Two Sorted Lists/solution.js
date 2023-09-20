/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function(list1, list2) { // list1 和 list2 分别代表两个已排序链表的first node = arr[0]
    const tempNode = new ListNode(0); // 创建一个新节点tempNode
    tempNode.next = null; // 初始化节点来构建链表

    let currentNode = tempNode; // tempNode去currentNode取值

    while (list1 !== null && list2 !== null) {  // 在list接不為null下持續循環，順序是根据节点的值大小
        if (list1.val < list2.val) { // 比较两个链表节点的值，找出list1节点值较list2小的節點
            currentNode.next = list1; // 放該list1節點入currentNode的下個節點
            list1 = list1.next; // 移动list1(currentNode的下個節點)指针到下一个节点(currentNode的下下個節點)
        } else { // 該list1节点值较list2节点值大
            currentNode.next = list2; // 放該list2節點入currentNode的下個節點
            list2 = list2.next; // 移动list2 (currentNode的下個節點) 指针到下一个节点
        }
        currentNode = currentNode.next; // 移动 currentNode 指针到下一个节点
    }

    currentNode.next = list1 || list2; // 其中一個list已經為null，剩下的值放入currentNode的下個節點
    return tempNode.next; // next 指向合并后的链表的第一个元素
}
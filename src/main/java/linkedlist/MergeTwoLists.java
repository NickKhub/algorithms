package linkedlist;

/**
 * Задача: смержить два однонаправленных (singly) и отсортированных linked list'а.
 * Time complexity: O(n+m), где n,m - размеры LinkedList'ов.
 * Space complexity: O(n+m), где n,m - размеры LinkedList'ов.
 * Решение проверено на LeetCode.
 */
public class MergeTwoLists {
    public SinglyListNode mergeTwoLists(SinglyListNode list1, SinglyListNode list2) {
        // case 1: both lists are empty
        if (list1 == null && list2 == null) {
            return null;
        }

        // case 2: first list is not empty, but second list is empty
        if (list2 == null) {
            return list1;
        }

        // case 3: second list is not empty, but first list is empty
        if (list1 == null) {
            return list2;
        }

        // case 4: both lists are not empty:
        SinglyListNode result = null;
        if (list1.val < list2.val) {
            result = new SinglyListNode(list1.val);
            list1 = list1.next;
        } else {
            result = new SinglyListNode(list2.val);
            list2 = list2.next;
        }
        SinglyListNode currentResultNode = result;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                currentResultNode.next = list2;
                return result;
            }
            if (list2 == null) {
                currentResultNode.next = list1;
                return result;
            }
            if (list1.val < list2.val) {
                currentResultNode.next = new SinglyListNode(list1.val);
                currentResultNode = currentResultNode.next;
                list1 = list1.next;
            } else {
                currentResultNode.next = new SinglyListNode(list2.val);
                currentResultNode = currentResultNode.next;
                list2 = list2.next;
            }
        }
        return result;
    }
}


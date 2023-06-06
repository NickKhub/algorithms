package linkedlist;

/**
 * Задача: Дан один из узлов однонаправленного (singly) связного списка.
 * Необходимо удалить этот узел из списка.
 * Ограничения: число узлов в списке [2, 1000]
 * Значения узлов [1000, 1000], каждое значение узла уникальное.
 * Узел, который должен быть удален из списка - это гарантированно не последний элемент списка.
 * Time complexity: O(1).
 * Space complexity: O(1).
 * Решение проверено на LeetCode.
 */
public class DeleteNodeWithoutHead {
    public void deleteNode(SinglyListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}



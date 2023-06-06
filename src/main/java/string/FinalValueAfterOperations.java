package string;

/**
 * Задача: имеется массив строк с возможными значениями: "--X", "X--", "++X", "X++".
 * Начальное значение переменной x = 0.
 * Операторы "--X" и "X--" уменьшают значение x на единицу.
 * Операторы "++X" и "X++" увеличивают значение x на единицу.
 * Необходимо вывести результат - значение переменной x после применения всех операторов в массиве строк.
 * Time complexity: O(n).
 * Space complexity: O(1).
 * Решение проверено на LeetCode.
 */
public class FinalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if ("--X".equals(operation) || "X--".equals(operation)) {
                result -= 1;
            } else {
                result += 1;
            }
        }
        return result;
    }
}

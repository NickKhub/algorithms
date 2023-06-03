package problem;

/**
 * Задача: имеется массив целых чисел digits[]. Все значения элементов в массиве лежат в диапазоне от 0 до 9.
 * Массив является представлением большого целого числа. Например, массив [1,0,0,0] представляет число 1000.
 * Необходимо увеличить исходное число на 1 и отдать результат в виде массива целых чисел:
 * [9] -> [1,0]
 * [1,3,4] -> [1,3,5]
 * [9,9,9] -> [1,0,0,0]
 * Time complexity: O(n).
 * Space complexity: O(n).
 * Решение проверено на LeetCode.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // ниже рассматриваем случай, когда все числа в изначальном массиве были 9-ками.
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

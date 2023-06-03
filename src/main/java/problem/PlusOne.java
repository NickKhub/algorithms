package problem;

/**
 * Задача: имеется массив целых чисел digits[]. Все значения элементов в массиве лежат в диапазоне от 0 до 9.
 * Массив является представлением большого целого числа. Например, массив [1,0,0,0] представляет число 1000.
 * Необходимо увеличить исходное число на 1 и отдать результат в виде массива целых чисел:
 * [9] -> [1,0]
 * [1,3,4] -> [1,3,5]
 * [9,9,9] -> [1,0,0,0]
 * Решение проверено на LeetCode.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        // сначала рассматриваем самый простой кейс: последняя цифра в массиве - не 9-ка.
        int lastIndex = digits.length - 1;
        if (digits[lastIndex] < 9) {
            digits[lastIndex] += 1;
            return digits;
        }
        // далее рассматриваем ситуацию, в которой последняя цифра - это 9-ка.
        int i = lastIndex;
        while (i >= 0 && digits[i] == 9) {
            digits[i] = 0;
            i--;
        }
        if (i != -1) {
            digits[i] += 1;
            return digits;
        }
        // ниже рассматриваем случай, когда все значения в массиве были 9-ками.
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int j = 1; j < result.length; j++) {
            result[j] = digits[j - 1];
        }
        return result;
    }
}

package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача: имея массив целых чисел nums и целое число target найти в массиве индексы такой пары чисел, которые в сумме
 * дадут число target. Есть гарантия, что в массиве существует ровно одна пара значений, подходящих под это правило.
 */
public class TwoSum {
    /**
     * Обычный алгоритм для решения задачи.
     * Time complexity: O(n^2).
     * Space complexity: O(1).
     * Решение проверено на LeetCode.
     * @param nums - массив целых чисел, в котором гарантированно существует пара чисел, в сумме дающих число target.
     * @param target - целое число.
     * @return массив с двумя индексами. Индексы указаны для тех элементов, сумма значений которых дает число target.
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int remainder = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == remainder) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * Улучшенный алгоритм для решения задачи.
     * Time complexity: O(n).
     * Space complexity: O(n).
     * Решение проверено на LeetCode.
     * @param nums - массив целых чисел, в котором гарантированно существует пара чисел, в сумме дающих число target.
     * @param target - целое число.
     * @return массив с двумя индексами. Индексы указаны для тех элементов, сумма значений которых дает число target.
     */
    public int[] twoSumImproved(int[] nums, int target) {
        Map<Integer, Integer> memory = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int reminder = target - nums[i];
            if (memory.get(reminder) != null) {
                result[0] = memory.get(reminder);
                result[1] = i;
                return result;
            } else {
                memory.put(nums[i], i);
            }
        }
        return result;
    }
}

package sort;

/**
 * Класс, предназначенный для сортировки массива целых чисел методом пузырька (улучшенным) в порядке возрастания.
 * Улучшение заключается в том, что вводится дополнительный флаг, показывающий, были ли перестановки элементов за
 * последний проход по массиву. Если перестановок не было - значит массив уже отсортирован, и нет смысла продолжать
 * работу далее.
 * <p>
 * Сортировка пузырьком - один из самых известных алгоритмов сортировки.
 * В нём последовательно сравниваются значения соседних элементов.
 * Если значения стоят в неправильном понядке, то они меняются местами.
 * Таким образом элементы с самыми большими значениями оказываются в конце списка, а с меньшими остаются в начале.
 * <p>
 * Алгоритм считается учебным и практически не применяется на практике из-за низкой эффективности: он медленно работает
 * на тестах, в которых маленькие элементы стоят в конце массива.
 * <p>
 * Сложность по времени:
 * Худшее время: O(n^2)
 * Среднее время: O(n^2)
 * Лучшее время: O(n)
 * Затраты по памяти: O(1)
 */
public class ImprovedBubbleSorter {
    private boolean wereThereSwaps;
    private int numberOfCircuits;
    public int[] sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array should be not null");
        }
        if (array.length == 0 || array.length == 1) {
            return array;
        }
        numberOfCircuits = 0;
        for (int i = 0; i < array.length; i++) {
            numberOfCircuits++;
            wereThereSwaps = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    wereThereSwaps = true;
                }
            }
            if (!wereThereSwaps) {
                break;
            }
        }
        return array;
    }

    public int getNumberOfCircuits() {
        return numberOfCircuits;
    }
}

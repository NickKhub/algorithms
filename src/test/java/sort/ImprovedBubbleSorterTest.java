package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тесты для улучшенной сортировки пузырьком")
public class ImprovedBubbleSorterTest {
    @Test
    @DisplayName("Массив на входе - null")
    void nullTest() {
        ImprovedBubbleSorter sorter = new ImprovedBubbleSorter();

        Assertions.assertThrows(IllegalArgumentException.class, () -> sorter.sort(null));
    }

    @Test
    @DisplayName("Пустой массив на входе")
    void emptyArrayTest() {
        int[] initialArray = new int[0];
        ImprovedBubbleSorter sorter = new ImprovedBubbleSorter();

        int[] result = sorter.sort(initialArray);

        Assertions.assertArrayEquals(initialArray, result);
    }

    @Test
    @DisplayName("В массиве только один элемент")
    void thereIsOnlyOneElementInTheArray() {
        int[] initialArray = {3};
        ImprovedBubbleSorter sorter = new ImprovedBubbleSorter();

        int[] result = sorter.sort(initialArray);

        Assertions.assertArrayEquals(initialArray, result);
    }

    @Test
    @DisplayName("В массиве есть неповторяющиеся отрицательные, положительные и нулевой элементы")
    void arrayWithUniqueElementsTest() {
        int[] initialArray = {5, 9, 0, -3, 8, -10, 4, -12, 966, 1};
        int[] expected = {-12, -10, -3, 0, 1, 4, 5, 8, 9, 966};
        ImprovedBubbleSorter sorter = new ImprovedBubbleSorter();

        int[] result = sorter.sort(initialArray);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("В массиве есть отрицательные, положительные и нулевые элементы (с повторами)")
    void arrayWithRepeatingElementsTest() {
        int[] initialArray = {1, 1, 0, 4, 4, -1, -2, -3, -1, 0, 0, 10, -11};
        int[] expected = {-11, -3, -2, -1, -1, 0, 0, 0, 1, 1, 4, 4, 10};
        ImprovedBubbleSorter sorter = new ImprovedBubbleSorter();

        int[] result = sorter.sort(initialArray);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("В лучшем случае сложность алгоритма равна O(n)")
    void linearComplexityAtTheBestCase() {
        int[] initialArray = {-2, -1, 0, 1, 2};
        ImprovedBubbleSorter sorter = new ImprovedBubbleSorter();

        int[] result = sorter.sort(initialArray);

        Assertions.assertArrayEquals(initialArray, result);
        Assertions.assertEquals(1, sorter.getNumberOfCircuits());
    }

    @Test
    @DisplayName("Ограниченное число проходов при частично отсортированном массиве")
    void partlySortedArrayTest() {
        int[] initialArray = {7, 6, -2, -1, 0, 1, 2};
        int[] sortedArray = {-2, -1, 0, 1, 2, 6, 7};
        ImprovedBubbleSorter sorter = new ImprovedBubbleSorter();

        int[] result = sorter.sort(initialArray);

        Assertions.assertArrayEquals(sortedArray, result);
        Assertions.assertEquals(3, sorter.getNumberOfCircuits());
    }
}

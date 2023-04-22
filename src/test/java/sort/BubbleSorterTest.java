package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тесты для сортировки пузырьком")
public class BubbleSorterTest {

    @Test
    @DisplayName("Массив на входе - null")
    void nullTest() {
        BubbleSorter bubbleSorter = new BubbleSorter();

        Assertions.assertThrows(IllegalArgumentException.class, () -> bubbleSorter.sort(null));
    }

    @Test
    @DisplayName("Пустой массив на входе")
    void emptyArrayTest() {
        int[] initialArray = new int[0];
        BubbleSorter bubbleSorter = new BubbleSorter();

        int[] result = bubbleSorter.sort(initialArray);

        Assertions.assertArrayEquals(initialArray, result);
    }

    @Test
    @DisplayName("В массиве только один элемент")
    void thereIsOnlyOneElementInTheArray() {
        int[] initialArray = {3};
        BubbleSorter bubbleSorter = new BubbleSorter();

        int[] result = bubbleSorter.sort(initialArray);

        Assertions.assertArrayEquals(initialArray, result);
    }

    @Test
    @DisplayName("В массиве есть неповторяющиеся отрицательные, положительные и нулевой элементы")
    void arrayWithUniqueElementsTest() {
        int[] initialArray = {5, 9, 0, -3, 8, -10, 4, -12, 966, 1};
        int[] expected = {-12, -10, -3, 0, 1, 4, 5, 8, 9, 966};
        BubbleSorter bubbleSorter = new BubbleSorter();

        int[] result = bubbleSorter.sort(initialArray);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("В массиве есть отрицательные, положительные и нулевые элементы (с повторами)")
    void arrayWithRepeatingElementsTest() {
        int[] initialArray = {1, 1, 0, 4, 4, -1, -2, -3, -1, 0, 0, 10, -11};
        int[] expected = {-11, -3, -2, -1, -1, 0, 0, 0, 1, 1, 4, 4, 10};
        BubbleSorter bubbleSorter = new BubbleSorter();

        int[] result = bubbleSorter.sort(initialArray);

        Assertions.assertArrayEquals(expected, result);
    }
}

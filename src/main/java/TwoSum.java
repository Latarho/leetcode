import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */


public class TwoSum {
    public static int[] twoSum(int[] numbersList, int target) {
        // Если массив null и его длина меньше < 2, то возвращаем null
        if (numbersList == null && numbersList.length < 2)
            return null;
        // Ключ - число в массиве, Значение - индекс этого числа
        Map<Integer, Integer> idxByValue = new HashMap<>();
        // Проходим по всему массиву
        for(int i = 0; i < numbersList.length; i++) {
            // Определяем искомое значение
            int current = target - numbersList[i];
            // Если в мапе есть это значение, то вернем массив с индексами этих чисел
            if(idxByValue.get(current) != null) {
                return new int[] {i, idxByValue.get(current)};
            }
            // Если число не найдено, то добавляем его и его индекс в мапу
            idxByValue.put(numbersList[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 17;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
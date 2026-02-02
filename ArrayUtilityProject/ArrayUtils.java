package ArrayUtilityProject;
public class ArrayUtils {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6};
        
        System.out.println("Sum of Evens: " + sumOfEvens(testArray));
        System.out.println("Occurrences of 2: " + countOccurrences(new int[]{2, 2, 2}, 2));
    }

    public static int sumOfEvens(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int countOccurrences(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
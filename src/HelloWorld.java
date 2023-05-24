import java.util.HashMap;

public class HelloWorld {

        public static void main(String[] args) {
            System.out.println("Hello, World!");
            int[]arr= new int []{3,3};
            System.out.println(findTwoSum(arr, 6));
        }


        // Time complexity: O(n)
        public static int[] findTwoSum(int[] nums, int target) {
            HashMap<Integer, Integer> numMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (numMap.containsKey(complement)) {
                    return new int[] { numMap.get(complement), i };
                } else {
                    numMap.put(nums[i], i);
                }
            }
            return new int[] {};
        }


}

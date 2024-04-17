class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int num1 = 38;
        System.out.println("Output for num1: " + solution.addDigits(num1)); // Output: 2
        
        int num2 = 0;
        System.out.println("Output for num2: " + solution.addDigits(num2)); // Output: 0
    }
}
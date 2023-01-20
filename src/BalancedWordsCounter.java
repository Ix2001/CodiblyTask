import java.util.HashMap;

public class BalancedWordsCounter {
    public int count(String input) throws Exception {
        if (input == null) {
            throw new Exception("Input text cannot be null");
        }
        if (!input.matches("^[a-zA-Z]*$")) {
            throw new Exception("Input text should contain letters only");
        }
        HashMap<Character, Integer> charCount = new HashMap<>();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            charCount.put(input.charAt(i), charCount.getOrDefault(input.charAt(i), 0) + 1);
        }
        for (int val : charCount.values()) {
            if (val > 1) {
                count += val * (val - 1) / 2;
            }
        }
        return count;
    }
}
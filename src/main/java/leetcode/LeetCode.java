package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode {

    /**
     * Letter Combinations of a Phone Number
     * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
     *
     * @param digits
     */
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        boolean isValidLength = digits.length() <= 4 && digits.length() >= 0 ? true : false;
        boolean isInRange = digits.chars().anyMatch(c -> c != '1' || c != '0');
        if (isInRange && isValidLength) {

        }
        return result;
    }

    public static void main(String[] args) {

    }
}

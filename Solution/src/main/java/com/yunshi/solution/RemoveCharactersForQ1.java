package com.yunshi.solution;

public class RemoveCharactersForQ1 {
    public static String removeConsecutive(String input) {
        String result = input.chars()
                .filter(c -> !isConsecutive(input, (char) c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        for (int i = 0; i < result.length(); i++) {
            if(isConsecutive(result,result.charAt(i))){
                result = removeConsecutive(result);
            }else {
                continue;
            }

        }
        return result;
    }

    private static boolean isConsecutive(String input, char c) {
        int count = 0;
        int index = input.indexOf(c);
        while (index < input.length() && input.charAt(index) == c) {
            count++;
            index++;
        }
        return count >= 3;
    }
}

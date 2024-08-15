package com.yunshi.solution;

import java.util.Stack;

public class RemoveCharactersForQ2 {
    public static String removeConsecutive(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int count = 1;
        boolean removeFlag = false;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            //如果栈为空，当前元素直接入栈
            if (stack.isEmpty()) {
                stack.push(currentChar);
                continue;
            }
            //判断当前字符是否和栈顶字符一致,一致则入栈计数器加1
            if (stack.peek() == currentChar) {
                count++;
                stack.push(currentChar);
                if (!removeFlag && count > 2) {
                    removeFlag = true;
                }
            } else {
                //不一致则判断removeFlag是否为true
                //为true就出栈count个元素
                if (removeFlag) {
                    for (int j = 0; j < count; j++) {
                        stack.pop();
                    }
                    //并把栈尾元素再次入栈,计数器直接置为2
                    if(!stack.isEmpty()) {
                        stack.push(stack.peek());
                        count = 2;
                    }
                    removeFlag = false;
                    //当前元素不直接处理，回退一位
                    i--;
                }else{
                    stack.push(currentChar);
                }
            }
        }
        // 弹出栈中剩余的所有字符
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}

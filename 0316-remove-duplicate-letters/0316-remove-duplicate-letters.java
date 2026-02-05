class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int freq[] = new int[26];
        boolean instack[] = new boolean[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c : s.toCharArray()){
            freq[c-'a']--;
            if(instack[c-'a']){
                continue;
            }
            while(!stack.isEmpty() && (stack.peek()>c) && (freq[stack.peek()-'a']>0)){
                instack[stack.pop()-'a'] = false;

            }
            stack.push(c);
            instack[c-'a'] = true;

        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
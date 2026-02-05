class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        for(char c: num.toCharArray()){
            while(!s.isEmpty() && k>0 && s.peek()>c){
                s.pop();
                k--;
            }
            s.push(c);
        }
            while(k>0&&!s.isEmpty()){
                s.pop();
                k--;
            }
            StringBuilder sb = new StringBuilder();
            while(!s.isEmpty()){
                sb.append(s.pop());
            }
            sb.reverse();
            int i=0;
           while(i<sb.length()&&(sb.charAt(i)=='0')){
            i++;
           }
           String res = sb.substring(i);
           return res = res.isEmpty()?"0":res;
        
    }
}
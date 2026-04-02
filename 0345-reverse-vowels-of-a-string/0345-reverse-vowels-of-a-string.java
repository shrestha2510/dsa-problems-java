class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int p=0;
        int q=n-1;
        ArrayList<Character> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
                a.add(arr[i]);
            }
        }
        Collections.reverse(a);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
           if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
                sb.append(a.remove(0));
            }
            else{
                sb.append(arr[i]);
            }
        }
        String result = sb.toString();
        return result;
    }
}
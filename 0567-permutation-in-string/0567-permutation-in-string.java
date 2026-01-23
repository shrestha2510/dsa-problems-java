class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m){
            return false;
        }
        int s1f[] = new int[26];
        int s2f[] = new int[26];
        for(int i=0;i<n;i++){
            s1f[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<n;i++){
            s2f[s2.charAt(i)-'a']++;
        }
        for(int i=n; i<m;i++){
            if(Arrays.equals(s1f,s2f)){
                return true;
            }
            s2f[s2.charAt(i)-'a']++;
            s2f[s2.charAt(i-n)-'a']--;
        }
        if(Arrays.equals(s1f,s2f)){
            return true;
        }

        return false;
    }
}
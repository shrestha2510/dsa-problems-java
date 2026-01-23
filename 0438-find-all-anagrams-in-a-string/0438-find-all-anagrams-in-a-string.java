import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        int n = s.length();
        int m = p.length();

        if (n < m) {
            return list;
        }

        int[] pf = new int[26];
        int[] sf = new int[26];

        for (int i = 0; i < m; i++) {
            pf[p.charAt(i) - 'a']++;
            sf[s.charAt(i) - 'a']++;
        }

      
        for (int i = m; i < n; i++) {
            if (Arrays.equals(pf, sf)) {
                list.add(i - m);
            }

            sf[s.charAt(i) - 'a']++;    
            sf[s.charAt(i - m) - 'a']--;  
        }

    
        if (Arrays.equals(pf, sf)) {
            list.add(n - m);
        }

        return list;
    }
}

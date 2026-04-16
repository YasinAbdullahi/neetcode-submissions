class Solution {
    public boolean isAnagram(String s, String t) {
        //[a,b,c] s = cab,  t = cabb
        //[a = 0, b = -1, c = ]
        //[a = 0, b = 0, c = 0] return true
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            //arr[c] --> arr[char]
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int nums : arr) {
            if (nums != 0) {
                return false;
            }
        }
        return true;

    }
}

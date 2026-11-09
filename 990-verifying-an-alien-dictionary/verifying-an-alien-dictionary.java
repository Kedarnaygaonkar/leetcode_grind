class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        int priority[] = new int[26];

        for(int i = 0; i < order.length(); i++) {
            priority[order.charAt(i) - 'a'] = i;
        }

        for(int i = 0; i < words.length - 1; i++) {

            int len = Math.min(words[i].length(), words[i+1].length());

            boolean different = false;

            for(int j = 0; j < len; j++) {

                int a = priority[words[i].charAt(j) - 'a'];
                int b = priority[words[i+1].charAt(j) - 'a'];

                if(a < b) {
                    different = true;
                    break;
                }

                if(a > b) {
                    return false;
                }
            }

            if(!different && words[i].length() > words[i+1].length()) {
                return false;
            }
        }

        return true;
    }
}
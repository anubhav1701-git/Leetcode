class Solution {
    public String toGoatLatin(String sentence) {
       String[] words = sentence.split(" ");
        String ans = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            char first = word.charAt(0);

            if (first == 'a' || first == 'e' || first == 'i' ||
                first == 'o' || first == 'u' ||
                first == 'A' || first == 'E' || first == 'I' ||
                first == 'O' || first == 'U') {

                ans += word + "ma";
            } 
            else {
                ans += word.substring(1) + first + "ma";
            }

           
            for (int j = 0; j <= i; j++) {
                ans += "a";
            }

            if (i != words.length - 1) {
                ans += " ";
            }
        }

        return ans;
    }
}
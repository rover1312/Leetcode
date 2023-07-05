class Solution {
    public String mergeAlternately(String word1, String word2) {
        String final1 = "";

        if(word1.length()>word2.length()){
            for(int i=0 ; i<word2.length(); i++){
                    final1 += Character.toString(word1.charAt(i)) +  Character.toString(word2.charAt(i));
            }
          final1 += word1.substring(word2.length(),word1.length());  
             
        }
        else if (word1.length() == word2.length()){
            for(int i=0 ; i<word2.length(); i++){
                    final1 += Character.toString(word1.charAt(i)) +  Character.toString(word2.charAt(i));
            }
        }
        else{
            for(int i=0 ; i<word1.length(); i++){
                    final1 += Character.toString(word1.charAt(i)) +  Character.toString(word2.charAt(i));
            }
            final1 += word2.substring(word1.length(),word2.length()); 
        }
    return final1;
    }
}

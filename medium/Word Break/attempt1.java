class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
            String text="";
            int count = 0;
            String reverse="";
            int middlefront = 0;
            int middleback = 0;
        if(s!=null && wordDict.size()>0){
            for (int i = 0 ; i < s.length() ; i++){
                text += Character.toString(s.charAt(i));
                reverse = reverse + Character.toString(s.charAt(s.length()-1-i));
                if(wordDict.contains(text)){
                    text = "";
                    count ++;
                }
        }
        }
        if(count>1){
            return true;
        }
        return false;
    }
}

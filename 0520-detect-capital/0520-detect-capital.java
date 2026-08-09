class Solution {
    public boolean detectCapitalUse(String word) {
        int uc = 0 ;
        for(int i=0 ; i<word.length() ; i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                uc ++;
            }
        }
        return uc == 0|| uc == word.length() || uc == 1 &&Character.isUpperCase(word.charAt(0));
        
    }
}
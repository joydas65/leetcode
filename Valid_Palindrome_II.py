class Solution {
    public static boolean checkForPalindrome(String s, int index){
        /*int n = s.length();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            char d = s.charAt(n-i-1);
            if(c != d)
                return false;
        }
        return true;*/
        
        int i = 0, j = s.length()-1;
        
        while(i < j){
            if(i == index){
                i++;
                continue;
            }else if(j == index){
                j--;
                continue;
            }else{
                char c = s.charAt(i);
                char d = s.charAt(j);
                if(c != d)
                    return false;
                i += 1;
                j -= 1;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        for(int i = 0; i < (n/2); i++){
            char c = s.charAt(i);
            char d = s.charAt(n-i-1);
            if(c != d)
                return checkForPalindrome(s,i) || checkForPalindrome(s,n-i-1);
        }
        return true;
    }
}

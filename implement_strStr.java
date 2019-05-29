class Solution {
    public int strStr(String haystack, String needle){
        
        if(needle.length() == 0)
            return 0;
        if(haystack.length() == 0)
            return -1;
        else
            return haystack.indexOf(needle);
    }
}

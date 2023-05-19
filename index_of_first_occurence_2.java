class index_of_first_occurence_2{
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).compareTo(needle)==0)
                return i;
            else
                continue;
        }
        return -1;
    }
}
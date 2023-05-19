class index_of_first_occurence{
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int count=0;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                count++;
                }
                else
                    break;
                }
            if(count==needle.length()){
                return i;
            }
        }
        return -1;
    }  
}
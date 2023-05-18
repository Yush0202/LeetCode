class LongestCommonPrefix_2{
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        for(int i=0;i<strs[0].length();i++){
            char x=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=x)
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}
public class LongestCommonPrefix_1{
    public static String smallest(String[] strs) {
        String first = strs[0];
        for (int i=1;i<strs.length; i++) {
            if ((strs[i].compareTo(first))<0) {
                first=strs[i];
            }
        }
        return first;
    }

    public static String longestCommonPrefix(String[] strs){
        String s=smallest(strs);
        for(int i=0;i<s.length();i++){
            char x=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=x)
                    return s.substring(0,i);
            }
        }
        return s;
    }
    public static void main(String[] args){
        String[] strs={"ab","a"};
        String s=longestCommonPrefix(strs);
        System.out.println(s);
    }
}
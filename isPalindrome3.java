class isPalindrome3{
    public boolean isPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        while(low<high){
            char First=s.charAt(low);
            char Last=s.charAt(high);
            if(!Character.isLetterOrDigit(First)){
                low++;
                continue;}
            if(!Character.isLetterOrDigit(Last)){
                high--;
                continue;}
            if(Character.toLowerCase(First)!=Character.toLowerCase(Last))
                return false;
            else{
                low++;
                high--;
            }
        }
        return true;
    }
}
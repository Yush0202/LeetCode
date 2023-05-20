class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] elements = s.split(" ");
        int m=elements.length;
        int count=0;
        for(int i=0;i<elements[m-1].length();i++){
            count++;
        }
        return count;
        
    }
}
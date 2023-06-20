class Solution {
    public String addBinary(String a, String b) {
      StringBuilder plus=new StringBuilder("");
      int l1=a.length()-1;
      int l2=b.length()-1;
      int carry=0;
      while(l1>=0 || l2>=0){
          int sum=carry;
          if(l1>=0){
              if(a.charAt(l1)=='1')
                sum++;
            l1--;
          }
          if(l2>=0){
              if(b.charAt(l2)=='1')
              sum++;
            l2--;
          }
          if(sum==3){
              plus.append('1');
              carry=1;
          }
          else if(sum==2){
              plus.append('0');
              carry=1;
          }
          else if(sum==1){
              plus.append('1');
              carry=0;
          }
          else{
              plus.append('0');
          }
      }
      if(carry==1)
      plus.append('1');
      return plus.reverse().toString();
    }
}
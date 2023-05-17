bool isPalindrome(int x){
 if(x>=0){int temp=x;
 int remainder;
 long reverse=0;
 while(temp!=0){
     remainder=temp%10;
     reverse=reverse*10+remainder;
     temp=temp/10;
 }
 if(x==reverse){
 return true;
 }
 else
 return false;
}
else
return false;
}
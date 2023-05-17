#include<string>
#include<stdio.h>
#include<iostream>
using namespace std;
class Solution {
public:
int Translate(char s){
    switch(s){
        case 'I':return 1;
        case 'V':return 5;
        case 'X':return 10;
        case 'L':return 50;
        case 'C':return 100;
        case 'D':return 500;
        case 'M':return 1000;
        default: return 0;
    }
}
int romanToInt(string s) {
        int num=0;
        for(int i=0;i<=s.size()-1;i++){
            if(Translate(s[i])<Translate(s[i+1])){
               num=num-Translate(s[i]);
            }
            else {
                num=num+Translate(s[i]);
            }
        }
        return num; 
     }
};

int main(){
 Solution a;
 string s="MCMXCIV";
 int number=a.romanToInt(s);
 cout<<number;
}
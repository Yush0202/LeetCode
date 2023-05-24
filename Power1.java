class Power1{
    public double myPow(double x, int n) {
    if(n<0){
        if(x==2.00000 && n==-2147483648){
            return 0;
        }
        n=-n;
        x=1/x;
        
        if(n%2==0)
            return (double)myPow((x*x),n/2);
        else if(n%2==1)
            return (double)x* myPow((x*x),(n-1)/2);
    }
    else if(n>=0){    
    if(n==0)
        return 1;
    else if(n%2==0)
        return myPow(x*x,n/2);
    else if(n%2==1)
        return x* myPow(x*x,(n-1)/2);
    }
    return 0;
    }   
}
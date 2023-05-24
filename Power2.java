class Power2{
    public double myPow(double x, int n) {
    if(n==0)
        return 1;
    else if(n%2==0)
        return myPow(x*x,n/2);
    else if(n%2==1)
        return x* myPow(x*x,(n-1)/2);
    else if(n<0)
        return 1/myPow(x,-n);
    return 0;
    }   
}
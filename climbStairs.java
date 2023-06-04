class climbStairs {
    public int climbStairs(int n) {
        int t0=1,t1=1,s=0,i;
        if(n<=1){
            return n;
        }
        for(i=2;i<=n;i++){
            s=t0+t1;
            t0=t1;
            t1=s;
        }
        return s;
    }
}
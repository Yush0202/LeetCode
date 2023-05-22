class Square_root {
    public int mySqrt(int x) {
        if(x==0 || x==1 ){
            return x;
        }
        else{
            long i;
            for(i=1;i<x;i++){
                if(i*i>x ){
                    return (int)i-1;
                }
                else if(i*i==x){
                    return (int)i;
                }
            }
        }
        return 1;
    }
}
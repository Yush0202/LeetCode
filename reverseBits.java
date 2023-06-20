public class reverseBits{
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev=0;
        int i=0;
        while(i<32){
            int lsb=n&1;
            int temp=lsb<<(31-i);
            rev=rev|temp;
            n>>=1;
            i++;
        }
        return rev;
    }
}
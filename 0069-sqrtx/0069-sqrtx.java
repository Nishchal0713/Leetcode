class Solution {
    public int mySqrt(int x) {
        int high=x;
        int low=0;
        int sqrt=0;
        while(high>=low)
        {
            int mid=(high+low)/2;
            long key=(long)mid*mid;
            if(key==x)
            {
                return mid;
            }
            else if(key>x)
            {
                high=mid-1;
            }
            else
            {
                sqrt=mid;
                low=mid+1;
            }
        }
        return sqrt;
    }
}
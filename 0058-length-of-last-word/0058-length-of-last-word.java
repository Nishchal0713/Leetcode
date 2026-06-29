class Solution {
    public int lengthOfLastWord(String s) {
        s=s.strip();
        int c=0,l=s.length()-1;
        while(l>=0)
        {
            if(s.charAt(l)!=' ')
            {
                c++;
                l--;
            }
            else
            {
                break;
            }

        }
        return c;
    }
}
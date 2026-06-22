class Solution {
    public String reverseVowels(String s) {

        char[] arr=s.toCharArray();
        int l=0,r=arr.length-1;

        while(l<r) 
        {

            while(l < r && arr[l] != 'a' && arr[l] != 'e' && arr[l] != 'i' && arr[l] != 'o' && arr[l] != 'u' && arr[l] != 'A' && arr[l] != 'E' && arr[l] != 'I' &&  arr[l] != 'O' && arr[l] != 'U') 
            {
                l++;
            }

            while (l < r && "aeiouAEIOU".indexOf(arr[r]) == -1) 
            {
                r--;
            }

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        return new String(arr);
    }
}
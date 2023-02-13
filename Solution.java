class Solution {
    public String baseConvert(int number, int base){
        return Integer.toString(number, base);
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i <= n-2; i++){
            String s = baseConvert(n, i);
            //check if base string is palindromic
            StringBuilder sb = new StringBuilder(s);
            if(!s.equals(sb.reverse().toString())){
                return false;
            }
        }
        return true;
    }
}

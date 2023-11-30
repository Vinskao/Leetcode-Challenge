class Solution {
    public void reverseString(char[] s) {
        int firstIndex = 0;
        int finalIndex = s.length - 1;
      
        for (int i = firstIndex; i < finalIndex; i++){
            char temp = s[i];
            s[i] = s[finalIndex];
            s[finalIndex] = temp;
            finalIndex--;
        }
    }
}
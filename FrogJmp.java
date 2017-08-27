class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        
        int temp = Y - X;
        return temp%D==0?temp/D:temp/D+1;
        
    }
}
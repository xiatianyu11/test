import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int minVal = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] - minVal != 1){
                return 0;
            }else{
                minVal = A[i];
            }
        } 
        return 1;
    }
}
import java.util.Arrays;
class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int minPositive = 0;
        for(int i = 0; i < A.length; i++){
           if(A[i] > 0){
              if(A[i] - minPositive > 1){ return minPositive + 1; }
              else {minPositive = A[i];}
           }
        } 
        return minPositive + 1;
    }
}
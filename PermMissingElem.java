import java.util.Arrays;
class PermMissingElem {
    public int solution(int[] A) {
        // write your code in Java SE 8
        // write your code in Java SE 8
        if(A.length == 0)return 1;
        if(A.length == 1){ if(A[0] == 1){return 2;}else{return 1;} }
        Arrays.sort(A);
        if(A[0] - 1 > 0)return 1;
        int i = 0; 
        for(; i < A.length - 1; i++){
            if(A[i+1] - A[i] > 1){
                return A[i] + 1;
            }
        }
        return A[A.length-1] + 1;
    }
}
Analysis summary
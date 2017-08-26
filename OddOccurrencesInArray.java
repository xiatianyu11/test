import java.util.Arrays;
public class OddOccurrencesInArray{

     public static void main(String []args){
        int[] A = new int[]{30,4,5,7,7,4,2,2,5, 6,9,10,10,9,6};
        System.out.println(solution(A));
     }
     
     
     public static int solution(int[] A) {
        // write your code in Java SE 8
        
		Arrays.sort(A);
        for(int i = 0; i < A.length; i= i + 2){
            if(i == A.length -1 || A[i] != A[i+1]){
                return A[i];
            }
            
            // System.out.println(A[i]+"----"+A[i+1]);
        }
        
        return -1;
        
        
    }
}

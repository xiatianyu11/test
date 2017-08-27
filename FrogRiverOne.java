import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set<Integer> list = new HashSet<Integer>();
        
        for(int i = 0; i < A.length; i++){
            if(list.add(A[i])){ 
                if(list.size() == X)return i;
            }
        } 
        
        return -1;
    }
}
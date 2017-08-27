class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] R = new int[N];
        int maxR = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] <= N && A[i] >= 1){
                R[A[i] - 1]++;
                if(R[A[i] - 1] > maxR)maxR = R[A[i] - 1];
            }else if(A[i] == N+1){
                for(int j = 0; j < R.length; j++){
                    R[j] = maxR;    
                }
            }
        } 
        
        return R;
    }
}

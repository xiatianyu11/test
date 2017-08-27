class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int leftSum = A[0], rightSum = 0, result = 0;
        for(int i = 1; i < A.length; i++){
            rightSum = rightSum + A[i];
        }
        result = Math.abs(leftSum - rightSum);
        for(int i = 1; i < A.length; i++){
            if(Math.abs(leftSum - rightSum) < result){
                result = Math.abs(leftSum - rightSum);
            }
            leftSum = leftSum + A[i];
            rightSum = rightSum - A[i];
        }
        return result;
    }
}
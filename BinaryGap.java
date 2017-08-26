public class BinaryGap{
	public static void main(String[] args){
		BinaryGap gap = new BinaryGap();
		System.out.println(gap.solution(1041));
	}

    public int solution(int N) {
        // write your code in Java SE 8
         String binaryRep = Integer.toBinaryString(N);
         int maxGap = 0;
         int startIndex = 0;
         int endIndex = 0;
         do{
            endIndex = binaryRep.indexOf("1", startIndex + 1);
            if(endIndex - startIndex - 1 > maxGap){
                maxGap = endIndex - startIndex - 1;
            }
            startIndex = endIndex;
         }while(endIndex != -1);
         return maxGap;
    }
}
Analysis summary
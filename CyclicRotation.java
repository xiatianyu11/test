public class  CyclicRotation {
	   public static void main(String []args){
	        int[] A = new int[]{-9,0};
	        CyclicRotation h = new CyclicRotation();
	        A= h.solution(A, 2);
	        for(int i = 0; i< A.length; i++)
	        System.out.print(A[i] + ",");
	     }
	     
	     
	      public int[] solution(int[] A, int K) {
	    	if(A == null)return A;
	    	if(A.length < 2)return A;
	    	while(K >= A.length)K = K-A.length;
	    	if(K == 0)return A;
	        int[] temp = new int[K];
	        for(int k = 0; k < K; k++){
	        	if(K >= A.length){
	        		temp[k] = A[K-A.length];
	        	}else{
	        		temp[k] = A[k];
	        	}
	        	
	        }
	        
	        for(int k = 0; k < K; k++){
	        	int tt = 0;
		        for(int i=k; i < A.length; i=i+K){
		            int j = i+K;
		            if(j >= A.length){
		            	j = j - A.length;
		            }
		            if(i == k){
		            	tt = A[j];
		            	A[j] = temp[k]; 
		            }else{
		            	//A[j] = A[k];
		            	int tx = A[j];
		            	A[j] = tt;
		            	tt = tx;
		            }
		        }
	        }
	       
	        return A;
	    }
}


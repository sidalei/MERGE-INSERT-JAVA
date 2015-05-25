
public class MERGE {
	
	static int A[] = {5,6,4,3,2,9,8,1,0,7};
	
	
	public static void main(String[] args) {
		System.out.println("MERGE-INSERT_JAVA-VERSION.");
		

//		System.out.println(A.length);
		
		int[] B=merge(0, A.length-1);
		for(int i=0; i<B.length; i++){
			System.out.println(B[i]);
		}
		
	}
	
	
	static int[] merge(int start, int end){ 	//(0, 9)
		
//		System.out.println("start="+start);
//		System.out.println("end="+end);
//		System.out.println();
		
		
		int result[] = new int[end-start+1];
		
		if(start == end){								//	 only one elements
			result[0]=A[start];
			
			System.out.print("result=");
			for(int k=0; k<result.length; k++){
				System.out.print(result[k]);
			}
			System.out.println();
			System.out.println();
			
			return result;
		}else{											//   more than 1 elements,devide into 2 parts
			int mid = (start+end)/2;					//	 (start,mid)(mid+1,end)
			
			int lenthL = mid-start+1;
			int lenthR = end-mid;
			
			int[] L = new int[lenthL];
			int[] R = new int[lenthR];
			
			
			L=merge(start, mid);
			
			
			R=merge(mid+1, end);
			
			
			//merge L & R into one array
			
//			System.out.println(L);
//			System.out.println(R);
//			System.out.println();
			
			int leftL=L.length-1;
			int leftR=R.length-1;
			
			System.out.print("L=");
			for(int k=0; k<L.length; k++){
				System.out.print(L[k]);
			}
			System.out.println();
			System.out.println();
			
			System.out.print("R=");
			for(int k=0; k<R.length; k++){
				System.out.print(R[k]);
			}
			System.out.println();
			System.out.println();
			
			int i=0;
			
			while(leftL>=0 && leftR>=0){
				if(L[L.length-leftL-1]<R[R.length-leftR-1]){
					result[i]=L[L.length-leftL-1];
					leftL--;
				}else{
					result[i]=R[R.length-leftR-1];
					leftR--;
				}
				i++;
			}
			
			if(leftL<0){
				while(leftR>=0){
					result[i]=R[R.length-leftR-1];
					leftR--;
					i++;
				}
			}
			else{
				while(leftL>=0){
					result[i]=L[L.length-leftL-1];
					leftL--;
					i++;
				}
			}
			
				
			
			
			System.out.print("result=");
			for(int k=0; k<result.length; k++){
				System.out.print(result[k]);
			}
			System.out.println();
			System.out.println();
			
			return result;
		}
		
		
	}
	
	
}


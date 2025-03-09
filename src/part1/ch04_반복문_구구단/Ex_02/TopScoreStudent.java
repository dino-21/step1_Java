package Ex_02;

public class TopScoreStudent {

	public static void main(String[] args) {
	   String[] names = {"안중근", "윤동주", "이상", "김두한", "안창호","김홍도"};
	   int[] scores  = {64, 74 , 88, 34, 45, 98};
	   
	   int i = topIndex(scores);
	   System.out.printf("1등 : %s(%d점)", names[i], scores[i]);
	}
	
	public static int topIndex(int[] arr) {
	  int topIdx = 0;
	  for (int i = 0 ; i < arr.length; i++) {
		  if(arr[topIdx] < arr[i]) {
			  topIdx = i; 
		  }
	  }
	  return topIdx;
	}

}

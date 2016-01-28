
public class MyKandan {
public int maxSubSeq(int [] n){
	int i,maxSum,maxCurSum,tempStart,startIndex,endIndex;
	maxCurSum=0;
	maxSum=0;
	startIndex=0;
	endIndex=0;
	tempStart=0;
	for (i=0;i<n.length;i++){ //maxSum less than 0, reset all index
		maxCurSum+=n[i];
		if(maxCurSum>maxSum){
			
			maxSum=maxCurSum;
			startIndex=tempStart;
			System.out.println(startIndex);
			endIndex=i;
		}
		if(maxCurSum<0){
			maxCurSum=0;
			tempStart=i+1;
		}
	}
	System.out.println("array from "+startIndex+" to end "+endIndex);
	return maxSum;
	
}
public static void main(String[] args){
	MyKandan kandan=new MyKandan();
	int n[]={10, 7, -3, -10, 4, 2, 8, -2, 4, -5, -6};
	int result=kandan.maxSubSeq(n);
	System.out.println(result);
	
}
}

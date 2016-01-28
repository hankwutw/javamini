
public class KadaneAlgorithm {

	int max_so_far=0;
	int max_ending_here=0;
	int []a;
	public KadaneAlgorithm(int [] a) {
	    this.a=a;
	}

	public int solution(){

	    int s=0;int e=0;boolean f=false;
	    for (int i = 0; i <a.length; i++) {

	        if (max_ending_here+a[i]>0) {
	        	System.out.println("max_end="+max_ending_here);
	        	System.out.println("a[i]="+a[i]);
	            max_ending_here=max_ending_here+a[i];

	            if (max_so_far<max_ending_here) {
	                max_so_far=max_ending_here;
	                if (!f) {
	                    s=i;
	                    System.out.println("s="+s);
	                    f=true;
	                }
	                e=i;
	                System.out.println("e="+e);
	            }
	        }

	    }
	    System.out.println("Position in array :(" + s +","+e+")");
	    return max_so_far;

	}

	public static void main(String[] args) {
	    int a[]={10, 7, -3, -10, 4, 2, 8, -2, 4, -5, -6}; // change it with your input array
	    //int a[] = {-6,2,-3,-4,-1,-5,-5};
	    //int a[]={-1,2,3,-3,4};

	    KadaneAlgorithm sdf = new KadaneAlgorithm(a);
	    System.out.println(sdf.solution());
	}
}

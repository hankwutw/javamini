
public class NumberToTextDollars_Ver_2 {
	
	private static final String[] tensWords={
			"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"
	};
	private static final String[] numwords={
			"","one","two","three","four","five","six","seven","eight","nine","ten","eleven",
			"twelve","thirteen","foruteen","fifteen","sixteen","seventeen","eithteen","ninteen"
	};
	
	private static final String[] overThousandWords = {
	        "",
	        " thousand",
	        " million",
	        " billion",
	        " trillion",
	        " quadrillion",
	        " quintillion"
	    };
	
	public String convertUnder1000(int number) {
		String textWord="";
		int n=number%100;
		if (n< 20){
			textWord = numwords[n];
        }
		else if (n<100) {
			textWord = tensWords[n/10];
		}
        else {
        	textWord = numwords[n % 10];
            n /= 10;
            
            textWord = tensWords[n % 10] + textWord;
            n /= 10;
        }
        if (n == 0) return textWord;
        return numwords[n] + " hundred " + textWord;
		
	}
	
	public String convertToWords(int number){
		String textWord="";
		int i=0;
		do {
			int n=number%1000;
			System.out.println("n="+n);
			if (n!=0){
				String s=convertUnder1000(n);
				System.out.println("s="+s);
				textWord = s+overThousandWords[i]+textWord;
				System.out.println("textword="+textWord);
			}
			i++;
			number=number/1000;
		}while(number>0);
		return textWord;
	}
	
	public static void main(String[] args){
		NumberToTextDollars_Ver_2 ntt=new NumberToTextDollars_Ver_2();
		String textWords=ntt.convertToWords(123457);
		System.out.println(textWords);
		
	}
	
	
	

}

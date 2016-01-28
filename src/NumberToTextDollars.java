
public class NumberToTextDollars {
	
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
		if (number % 100 < 20){
			System.out.println(number%100);
			textWord = numwords[number % 100];
            number /= 100;
        }
        else {
        	textWord = numwords[number % 10];
            number /= 10;
            
            textWord = tensWords[number % 10] + textWord;
            number /= 10;
        }
        if (number == 0) return textWord;
        return numwords[number] + " hundred " + textWord;
		
	}
	
	public String convertToWords(int number){
		boolean isLastNumber=false;
		String textWord="";
		int i=0;
		while (!isLastNumber){
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
			
			if (number<=0) isLastNumber=true;
		}
		return textWord;
	}
	
	public static void main(String[] args){
		NumberToTextDollars ntt=new NumberToTextDollars();
		String textWords=ntt.convertToWords(12345);
		System.out.println(textWords);
		
	}
}

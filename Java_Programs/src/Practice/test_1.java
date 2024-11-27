package Practice;

public class test_1 {
	public static void main(String[] args) {
		int number = 153;
		int temp = number;
		int len =0;
		while(temp != 0) {
			temp = temp / 10;
			len ++;
		}
		temp = number;
		int sum = 0;
		while (temp != 0) {
			int mul = 1;
			int rem = temp % 10;
		for(int i = 1 ; i <= len; i++) {
			mul = mul * rem;
		}
		sum = sum + mul;
		temp = temp /10;
	}
		if(sum == number) {
			System.out.println("Armstrong ");
		}else {
			System.out.println("Not armstrong");
		}
	}
}
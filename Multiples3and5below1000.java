public class Multiples3and5below1000 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int sum = 0;
		int i = 0;
		while (i < 1000) {
			if (i % a == 0 || i % b == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}

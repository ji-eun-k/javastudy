
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b);

		// int c = 1.1;

		// double을 int로 바꿀 수 없음, int는 double형으로 알아서 바꿀 수 있음

		double d = 1.1;
		int e = (int) 1.1;

		System.out.println(e);

		// 손실이 일어나기 때문에 내가 1이라고 해주기 전까지 자동으로 casting 해주지 않음.

		String str1 = Integer.toString(1);
		System.out.println(str1.getClass());

	}

}

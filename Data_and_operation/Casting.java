
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b);

		// int c = 1.1;

		// double�� int�� �ٲ� �� ����, int�� double������ �˾Ƽ� �ٲ� �� ����

		double d = 1.1;
		int e = (int) 1.1;

		System.out.println(e);

		// �ս��� �Ͼ�� ������ ���� 1�̶�� ���ֱ� ������ �ڵ����� casting ������ ����.

		String str1 = Integer.toString(1);
		System.out.println(str1.getClass());

	}

}

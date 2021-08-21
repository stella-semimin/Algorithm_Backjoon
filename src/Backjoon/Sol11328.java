package Backjoon;
import java.util.Scanner;
public class Sol11328 {
	public static void main(String[] args) {
		/*
		 * ���� 11328 Strfry C ��� ���α׷��ֿ��� ���ڿ�(string)�� native�� �ڷ����� �ƴϴ�. ���, ���ڿ��� ����, ���ڿ���
		 * ���� ǥ���ϱ� ���� ������ NULL�� ����, ���ڵ�� �̷���� ���ڿ��� ���̴�. ������ ���α׷��� ���� ���ڿ��� �ٷ�� ���� �ſ�
		 * �߿��ϱ� ������, C ǥ�� ���̺귯���� ���ڿ��� �ٷ�� ���� �ſ� ������ �Լ����� �����ϰ� �ִ� : �׵� �߿��� strcpy,
		 * strcmp, strtol, strtok, strlen, strcat �� �ִ�. ������, �� �˷��� ���� ������, �� �������� �ʴ�
		 * �Լ��� �ϳ� �ִ� : strfry �Լ���. strfry �Լ��� �Էµ� ���ڿ��� �������� ��迭�Ͽ� ���ο� ���ڿ��� ������. (���� ��
		 * : ���⿡�� �Էµ� ���ڿ��� ���� ��迭�� ���ڿ��� �ٸ� �ʿ�� ����.) �� ���� ���ڿ��� ����, 2��° ���ڿ��� 1��° ���ڿ���
		 * strfry �Լ��� �����Ͽ� ����� �� �ִ��� �Ǵ��϶�.
		 * 
		 * �Է� : �Է��� ù ��° ���� �׽�Ʈ ���̽��� �� 0 < N < 1001 �̴�. ������ �׽�Ʈ ���̽��� �ϳ��� �ٿ� ���� �ҹ��ڵ�θ�
		 * �̷���� �� ���� ���ڿ��� �� ���� �������� ���еǾ� �־�����. ������ ���ڿ��� ���̴� �ִ� 1000 �̴�.
		 * 
		 * ��� :������ �׽�Ʈ ���̽��� ����, 2��° ���ڿ��� 1��° ���ڿ��� strfry �Լ��� �����Ͽ� ����� �� �ִ����� ���θ�
		 * "Impossible"(�Ұ���) �Ǵ� "Possible"(����)���� ��Ÿ���ÿ�. (����ǥ�� �����ϰ� ����Ѵ�.)
		 */

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // 1~1000

		for (int i = 0; i < num; i++) {
			// ���ĺ� ���� ��������
			int alph[] = new int[26];
			// ���ڿ� �Է¹ޱ�
			char[] a = scan.next().toCharArray();
			char[] b = scan.next().toCharArray();

			boolean result = true;

			// �迭�� ���ĺ� ���� ����ֱ�
			for (char ch : a) {
				alph[ch - 97]++;
			}
			for (char ch : b) {
				alph[ch - 97]--;
			}

			// �迭�� üũ�ϱ�
			for (int item : alph) {
				if (item != 0) { // ���ĺ������� 0�̾�� ����, �ٸ��� Impossible
					result = false;
					break;
				}
			}
			// 3. ��� ����
			System.out.println(result ? "Possible" : "Impossible");

		}

	}

}
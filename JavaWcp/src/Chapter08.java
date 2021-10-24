
public class Chapter08 {
	public static void main(String[] args) {
		// 1.「while」文
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}
		// 2. 通常「for」文
		int[] array = { 1, 5, 10, 15 };
		for (int num = 0; num < array.length; num++) {
			System.out.println(array[num]);
		}
		// 3. 拡張「for」文
		for (int val : array) {
			if (val % 2 == 0) {
				//numが偶数の場合、この後の処理をスキップ
				continue;
			}
			System.out.println(val);
		}
	}
}

import java.util.Random;
import java.util.Scanner;

public class Generate {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		Random rnd = new Random();
		String s = "";
		for (int i = 0; i < 17; i++) {
			int num = rnd.nextInt(4);
			s += (char) ((char) 'a' + num);
		}
		System.out.println(s);
		fs.close();
	}
}

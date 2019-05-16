package test;

import java.util.Random;
import java.util.Scanner;

public class cc {

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int rand = 50;
		int nextRand = rnd.nextInt(100);
		String input = null;
		while(true)
		{
			System.out.println("今の数値は" + rand + "です");
			System.out.println("high か low を入力してください");
			input = sc.next();



		}
	}

}

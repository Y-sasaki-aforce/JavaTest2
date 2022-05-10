package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 10;
		int y = 28;
		double z  = 3.14;

		//練習問題①
		System.out.println(x*y);

		//練習問題②
		System.out.println(y/x);
		System.out.println(y%x);

		//練習問題③
		double num = y*z;
		System.out.println(num);

		//練習問題④
		num++;
		System.out.println(num);

		//練習問題⑤
		int age = 23;

		Random random = new Random();
		int randomNumber = random.nextInt(100);


		if(age > randomNumber) {
			System.out.println("私の方が年上です");
		}else if (age < randomNumber) {
			System.out.println("私の方が年下です");
		}else if(age == randomNumber) {
			System.out.println("私と同い年です");
		}
	}

}

package jp.co.aforce.test;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PracticeTest8 practiceTest8 = new PracticeTest8();

		//練習問題①
		practiceTest8.printHello();

		//練習問題②
		practiceTest8.printRandomMessage();

		//練習問題③
		practiceTest8.printMessage("Hello");

		//練習問題④
		practiceTest8.printMessage("Hello", 5);

		//練習問題⑤
		practiceTest8.printRectangleArea(3.5, 4.7);

		//練習問題⑥
		System.out.println(practiceTest8.getWeatherForecast());

		//練習問題⑦
		System.out.println(practiceTest8.isEvenNumber(20));

		//練習問題⑧
		System.out.println(practiceTest8.getMessage("佐々木祐哉", false));

		//練習問題⑨
		String[] days = {"今日","明日","明々後日"};
		System.out.println(practiceTest8.getLongestString(days));

		//練習問題⑩
		Person person = new Person("佐々木祐哉",23);
		System.out.println(practiceTest8.isAdult(person));
	}

}

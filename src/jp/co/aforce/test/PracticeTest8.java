package jp.co.aforce.test;

public class PracticeTest8 {


		// TODO 自動生成されたメソッド・スタブ
		//練習問題①
		public void printHello() {
			System.out.println("Hello");
		}


		//練習問題②
		public void printRandomMessage() {
			int n = (int)(3 * Math.random());
			if(n == 0) {
				System.out.println("こんばんは");
			}else if(n == 1) {
				System.out.println("こんにちは");
			}else {
				System.out.println("おはよう");
			}
		}


		//練習問題③
		public void printMessage(String message) {
			System.out.println(message);
		}


		//練習問題④
		public void printMessage(String message, int count) {
			for(int i = 0;i < count;i++) {
				System.out.println(message);
			}
		}


		//練習問題⑤
		public void printRectangleArea(double height, double width) {
			System.out.println("面積：" + height * width);
		}


		//練習問題⑥
		public String getWeatherForecast() {
			int a = (int)(3 * Math.random());
			int b = (int)(4 * Math.random());
			String date;
			String weather;

			if(a == 0) {
				date = "今日";
			}else if(a == 1) {
				date = "明日";
			}else {
				date = "明後日";
			}

			if(b == 0) {
				weather = "晴れ";
			}else if(b == 1) {
				weather = "曇り";
			}else if(b == 2) {
				weather = "雨";
			}else {
				weather = "雪";
			}

			String message= date + "の天気は" + weather + "でしょう";
			return message;
		}


		//練習問題⑦
		public boolean isEvenNumber(int value) {
			if(value % 2 == 0) {
				return true;
			}else {
				return false;
			}
		}


		//練習問題⑧
		public String getMessage(String name, boolean isKid) {
			String message;
			if(isKid) {
				message = "こんにちは。" + name + "ちゃん。";
			}else {
				message = "こんにちは。" + name + "さん。";
			}
			return message;
		}


		//練習問題⑨
		public String getLongestString(String[] array) {
			String str = null;
			int maxCount = array[0].length();

			for(String arr : array) {
				int arrCount = arr.length();
				if(maxCount <= arrCount) {
					maxCount = arrCount;
					str = arr;
				}
			}
			return str;
		}


		//練習問題⑩
		public boolean isAdult(Person person) {
			if(person.getAge() >= 20) {
				return true;
			}else {
				return false;
			}
		}

}

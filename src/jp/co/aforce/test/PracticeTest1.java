package jp.co.aforce.test;


public class PracticeTest1 {
	//定数:消費税
	private static final double TAX = 0.1;

	public static void main(String[]args) {
	//練習問題①
	System.out.println(TAX);

	//練習問題②
	int x = 480;
	int price = (int)(x*(1+TAX));
	System.out.println(price + "円");

	//練習問題③
	String name = "佐々木祐哉";
	System.out.println(name);

	//練習問題④
	/*クラスやその中で定義されるフィールドやメソッドなどが、外から見える範囲を制限するための仕組みです。
	このアクセス制御には private 、 protected 、 public という３つの 修飾子 を使います。*/

	//練習問題⑤
	//デフォルト
	//同一パッケージのクラスからのみ参照
	}
}

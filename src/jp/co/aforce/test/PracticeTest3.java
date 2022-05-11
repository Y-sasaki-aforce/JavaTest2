package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;

public class PracticeTest3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題①
		String[] employee = {"1","田中太郎","男性","27"};
		//練習問題②
		System.out.println(employee[1]);

		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "田中太郎", "男性",27));
		employeeList.add(new Employee(2, "佐藤花子", "女性" ,22));
		employeeList.add(new Employee(3, "鈴木次郎", "男性",31));

		for(Employee employees : employeeList){
			  System.out.println("番号は"+ employees.getNumber()+"、名前は"+employees.getName()+"、年齢は"+employees.getAge()+ "です");
		}


		//練習問題⑤
		/*String [] subject = {"国語", "数学","英語"};
		int [] score = {90, 80,65};
		// (1)
		for (String string : subject) {
			for (int scores : score) {
			System.out.println(string + ":" +scores);
			}
		}*/

		HashMap<String, Integer>scoresHashMap = new HashMap<>();

		scoresHashMap.put("国語", 90);
		scoresHashMap.put("数学", 80);
		scoresHashMap.put("英語", 70);

		for(HashMap.Entry<String, Integer>score:scoresHashMap.entrySet()) {
				System.out.println(score.getKey()+":"+score.getValue());
		}
		//練習問題⑥
		/*データを要素として格納するのにコードを簡素化できるから*/
		
		//

    }

}

package jp.co.aforce.test;



public class Employee {
	//練習問題③.④
		private int number;

		private String name;

		private String gender;

		private int age;

		public Employee(int number,String name,String gender,int age) {
			this.number = number;
			this.name = name;
			this.gender = gender;
			this.age = age;
		}

		public int getNumber() {
			return number;
		}

		public String getName() {
			return name;
		}

		public String getGender() {
			return gender;
		}

		public int getAge() {
			return age;
		}

}

package extend;

import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		// Humanクラスのインスタンスを生成
		Human sugimoto = new Human("杉本", 16);
		System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());
		
		// Studentクラスのインスタンスを生成
		Student sato = new Student("佐藤", 17, 70);
		// サブクラスのインスタンスからスーパークラス(Humanクラス)のメソッドを呼び出し
		System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
		/// studentクラスに追加したgetStudentprofileメソッドを呼び出し
		System.out.println("Studentクラスのメソッド：プロフィールは、" + sato.getStudentProfile());
		
		
	}

}

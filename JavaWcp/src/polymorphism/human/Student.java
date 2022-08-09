package polymorphism.human;

// Humanクラスを継承
public class Student extends Human {
	private Student(String name, int age, int score) {
		// スーパークラスのコンストラクタを呼び出し
		super(name, age);
		this.score = score;
	}
	
	// オーバーライドして、Studentクラス用に処理を変更
	@Override
	public String getProfile() {
		String profile = "年齢は" + super.age + "です。";
		prifile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
		}
	}

}

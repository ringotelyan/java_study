package classMethod;

import classMethod.human.Human04;

public class classMethod04 {
	public static void main(String[] args) {
		// Human04インスタンスを生成すると、コンストラクタ内の処理が実行sれる
		Human04 yamada = new Human04("山田");
		
		// 静的メンバーは、インスタンスを生成せずに直接使用できる
		Human04.staticMethodPrint();
		
		// statucな暮らす定数もインスタンスを生成せずに参照できる
		System.out.println(Human04.GREETING);
		
		// インスタンスメンバーは直接使用できない（コンパイルエラーになる）
		// Human04.instanceMethodPring()+
		// System.out.println(Human04.name)+
		
		// インスタンスメンバーはインスタンス生成してから使用する
		yamada.instanceMethodPrint();
		
	}

}

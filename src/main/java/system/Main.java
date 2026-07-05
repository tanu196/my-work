package system;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		//一人目の処理
		Reji reji = new Reji();
		Scanner sc = new Scanner(System.in);
		boolean find = false;
		do {
			System.out.println("会員番号");
	
			String memberNo = sc.next();
			reji.rentalMemberSerch(memberNo);
			System.out.println(reji.rentalMemberSerch(memberNo) + "様");			
			System.out.println();
			if(memberNo.equals("N")) {
				System.out.println("会員登録を行ってください");
				find = true;
			}
		}while(find); //例外処理
		
		
		do {
			System.out.println("商品番号入力");
			
			String input2 = sc.next();
			reji.rentalDvdSerch(input2);
			System.out.println(reji.rentalDvdSerch(input2) + "円");
			System.out.println("商品はまだありますか？");
			input2 = sc.next();
			if( input2.equals("N") ) {
				System.out.print("合計金額:");
				break;
			}
			
		} while (true);  //例外処理
		reji.rentalTotalPrice();
		System.out.println();
		//延滞料金発生するかどうかの判定と処理
		
		reji = new Reji(sc);
		reji.returnProcess();
		
		
		
		
	}
}












/*お客様がDVDを持ってくる
 * 店員さんがDVDをスキャンする
 * ＤＶＤが表示される
 * 金額が表示される
 * お客さんが支払う
 * 
 * 
 * 	<クラス>
 *店員　レンタル　返却　ー＞レンタルメソッド　返却メソッド　
 *会員　会員の情報　ー＞情報の管理だけフィールド
 *DVD　DVDの情報　ー＞DVDの情報管理だけフィールド
 *レジ　繋ぐ係　ー＞順序を考えていく　DVDの情報を入れるー＞会員の情報を入れるー＞レンタルメソッドの情報を入れてレジクラスで出力する
 *ー＞返却メソッドの情報を入れてレジクラスで出力する
 *
 *
 *
 * ＜フィールド＞
 * DVDのタイトル　新しさ　商品番号
 *会員ナンバー　会員名　ポイント
 * 店員のところに　新しさによって変わる値段　延滞料金　枚数　日数　
 * 新しさの項目がかぶっているので定員のところにgetter setterメソッドで持ってきて計算を担う
 *	<メソッド>
 *返却　レンタル　マニュアル　
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *	
 *
 */


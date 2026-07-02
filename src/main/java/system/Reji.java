package system;

import java.util.Scanner;

import customer.Member;
import item.DVD;

public class Reji {

	private Scanner sc;

	// レジがもつ情報
	DVD[] dvds = new DVD[100];
	Member[] members = new Member[100];

	// レジが持つ機能

	public Reji() {
		startUp();
	}

	public Reji(Scanner sc) {
		this.sc = sc;
	}

	// レンタル準備
	public void startUp() {
		// 商品を準備する
		dvds[0] = new DVD("鬼滅の刃", "新作", "0001");
		dvds[1] = new DVD("千と千尋の神隠し", "旧作", "0002");
		dvds[2] = new DVD("天気の子", "準新作", "0003");

		members[0] = new Member("0001", "ishimaru", 1000);
		members[1] = new Member("0002", "hayato", 1001);
		members[2] = new Member("0003", "shohei", 1002);

	}

	// レンタル処理
	public void rental1(String memberNo, int point) {

		// 会員検索 + ポイントの計算
		String memberId = "";
		for (Member m : members) {
			if (memberNo.equals(m.getCode())) {
				memberId = m.getCode();
				System.out.println(m.getName() + "様");
				break;
			}
		}
	}

	private int sum = 0;
	static int count = 0;
	static boolean judge = false;

	public void rental2(String dvdNo) {
		// DVD検索
		int price = 0;
		for (DVD d : dvds) {
			if (dvdNo.equals(d.getNumber())) {
				price = d.getPrice();
				sum += price;
				judge = d.getJudge();
				count++;
				break;
			}
		}

		System.out.println(count);
		System.out.println(price + "円");
		System.out.println("現在の合計金額" + sum + "円");
	}

	//合計金額表示
	public void rental3() {
		System.out.println(sum + "円");
	}

	//返却の時の処理
	public void return1() {
		if (judge) {
			int overdue = 0;
			System.out.println("何日遅れたのかを入力してください");
			int dvdDays = sc.nextInt();
			overdue = 220 * dvdDays * count;
			System.out.println("延滞料金 " + overdue + "円");
			judge = false;
		}
	}

}

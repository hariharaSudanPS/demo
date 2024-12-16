import java.util.Scanner;

public class main {
	String item[] = { "1.Coffee Rs:20/-", "2.Tea Rs:18/-", "3.Dosa Rs:30/-", "4.idly Rs:30/-", "5.vada Rs:50/-",
			"6.pongal Rs:70/-", "7.poori Rs:45", "'0' to end your order!" };
	static int coffee = 20;
	static int tea = 18;
	static int dosa = 30;
	static int idly = 30;
	static int pongal = 70;
	static int poori = 45;
	static int vada = 50;
	static int amt;
	static int rem_amt;

	void menu() {
		for (String var : item) {
			System.out.println("-->" + var);
		}
	}

	int coffee(int amt) {
		int rem = Math.abs(coffee - amt);
		return rem;
	}

	int tea(int amt) {
		int rem = Math.abs(tea - amt);
		return rem;
	}

	int dosa(int amt) {
		int rem = Math.abs(dosa - amt);
		return rem;
	}

	int idly(int amt) {
		int idly = 30;
		int rem = idly - amt;
		return rem;
	}

	int vada(int amt) {
		int rem = Math.abs(vada - amt);
		return rem;
	}

	int poori(int amt) {
		int rem = Math.abs(poori - amt);
		return rem;
	}

	int pongal(int amt) {
		int rem = Math.abs(pongal - amt);
		return rem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		main object = new main();
		System.out.println("WELLCOME! TO VANITHA BHAVAN");
		object.menu();
		while (true) {
			System.out.println("enter the item ");
			if (sc.hasNextInt()) {
				int n = sc.nextInt();
				if (n == 0) {
					System.out.println("exiting the order thankyou for visiting...");
					break;
				}
				if (n == 1) {
					System.out.println("the coffee price is Rs20/-");
					System.out.print("cash please:");
					amt = sc.nextInt();
					if (coffee <= amt) {
						rem_amt = object.coffee(amt);
						System.out.println("remaining amount :" + rem_amt);
						System.out.println("here is your hot coffee!");
					} else {
						System.out.println("insufficient amount");
					}
				}

				else if (n == 2) {
					System.out.println("the tea price is Rs15/-");
					System.out.print("cash please:");
					amt = sc.nextInt();
					if (tea <= amt) {
						rem_amt = object.tea(amt);
						System.out.println("remaining amount :" + rem_amt);
						System.out.println("here is your hot tea!");
					} else {
						System.out.println("insufficient amount");
					}
				} else if (n == 3) {
					System.out.println("the dosa price is Rs30/-");
					System.out.print("cash please:");
					amt = sc.nextInt();
					if (dosa <= amt) {
						rem_amt = object.dosa(amt);
						System.out.println("remaining amount :" + rem_amt);
						System.out.println("here is you dosa!");
					} else {
						System.out.println("insufficient amount");
					}
				} else if (n == 4) {
					System.out.println("the idly price is Rs30/-");
					System.out.print("cash please:");
					amt = sc.nextInt();
					if (idly <= amt) {
						rem_amt = object.idly(amt);
						System.out.println("remaining amount :" + rem_amt);
						System.out.println("here is your fluffy idly!");
					} else {
						System.out.println("insufficient amount");
					}
				}

				else if (n == 5) {
					System.out.println("the vada price is Rs50/-");
					System.out.print("cash please:");
					amt = sc.nextInt();
					if (vada <= amt) {
						rem_amt = object.vada(amt);
						System.out.println("remaining amount :" + rem_amt);
						System.out.println("here is your crispy vada!");
					} else {
						System.out.println("insufficient amount");
					}
				} else if (n == 6) {
					System.out.println("the pongal price is Rs70/-");
					System.out.print("cash please:");
					int amt = sc.nextInt();
					if (pongal <= amt) {
						rem_amt = object.pongal(amt);
						System.out.println("remaining amount :" + rem_amt);
						System.out.println("here is your pongal!");
					} else {
						System.out.println("insufficient amount");
					}
				}

				else if (n == 7) {
					System.out.println("the poori price is Rs45/-");
					System.out.print("cash please:");
					int amt = sc.nextInt();
					if (poori <= amt) {
						rem_amt = object.poori(amt);
						System.out.println("remaining amount :" + rem_amt);
						System.out.println("here is your poori");
					} else {
						System.out.println("insufficient amount");
					}
				} else {
					System.out.println("Sorry! Not in menu,please enter the item in the menu");
				}
			}
		}
		sc.close();
	}
}

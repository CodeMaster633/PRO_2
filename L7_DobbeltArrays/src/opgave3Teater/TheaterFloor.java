package opgave3Teater;

public class TheaterFloor {
	int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
			{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

	/**
	 * Hvis plads seat på række row er ledig reserveres pladsen og prisen på pladsen
	 * returneres. Der returneres 0 hvis pladsen er optaget.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */

	public int buySeat(int row, int seat) {

		int pris = seats[row][seat];

		if(pris!=0){seats[row][seat] = 0;}

		return pris;
	}

	/**
	 * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
	 * prisen returneres. Der returneres 0, hvis der ikke er nogen pladser ledige
	 * til den pågældende pris.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */
	public int buySeat(int price) {
		boolean fundetLedig = false;

			for (int i = 0; i < seats.length; i++) {
				for (int j = 0; j < seats[0].length; j++) {
						if (seats[i][j] == price) {
							seats[i][j] = 0;
							return price;
						}
					}
				}

		return 0;

	}

	public void printTheaterFloor() {
		System.out.println("    Sæde:  1   2   3   4   5   6   7   8   9   10");
		System.out.println("         -----------------------------------------");

		int sum = 0;

		for (int i = 0; i < seats.length; i++) {
			System.out.print("Række "+(i+1)+" : ");
			for (int j = 0; j < seats[0].length; j++) {
				System.out.print(" "+seats[i][j]+",");
			}
			System.out.print("\n");
		}
	}

	}


package opgave3Teater;

import java.util.Scanner;

public class TheaterFloorApp {

	public static void main(String[] args) {
		TheaterFloor theater = new TheaterFloor();
		Scanner input = new Scanner(System.in);


		System.out.println("Bestil bestemt plads indtast 0, bestil efter pris indtast 1" );
		int nulEllerEt = input.nextInt();

		if(nulEllerEt==0){
			System.out.println("Indtast række nr" );
			int række = input.nextInt();

			System.out.println("Indtast sæde nr" );
			int seat = input.nextInt();

			theater.buySeat(række,seat);
			theater.printTheaterFloor();
		}else if (nulEllerEt==1) {
			System.out.println("Indtast pris");
			int pris = input.nextInt();

			theater.buySeat(pris);
			theater.printTheaterFloor();
		}else{
			System.out.println("Der skete en fejl");
		}


//		theater.printTheaterFloor();
//
//		System.out.println();
//		theater.buySeat(1,1);
//		theater.printTheaterFloor();
//
//		System.out.println();
//		theater.buySeat(10);
//		theater.printTheaterFloor();
//
//		System.out.println();
//		theater.buySeat(10);
//		theater.printTheaterFloor();

	}
}

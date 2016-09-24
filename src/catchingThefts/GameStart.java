package catchingThefts;

import java.util.Scanner;

import catchingThefts.Helper.Positioners;
import catchingThefts.Model.Grid;
import catchingThefts.Model.Player;

public class GameStart {

	public static void main(String[] args) {

		System.out.println("===============");
		System.out.println("catchingThefts");
		System.out.println("===============");
		
		System.out.println("enter grid size as integer: ");
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("okay!");
		
		Grid grid = new Grid(size);
		Player theft = new Player(false);
		Player user = new Player(true);
		
		System.out.println("===============");
	
		GridControl control = new GridControl(grid, new Player[]{theft, user});
		
		System.out.println("===============");
		System.out.println("go!");
		System.out.println("===============");
		
		control.start();
	}

}

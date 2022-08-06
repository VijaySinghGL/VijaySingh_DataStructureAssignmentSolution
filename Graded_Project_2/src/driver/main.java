package driver;

import java.util.Scanner;

import service.floorplan;

public class main {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			
		System.out.println("Enter the total Number of floors in the building.");
			
		int no_of_floors = sc.nextInt();
			
			
		floorplan obj = new floorplan(no_of_floors);
			
		
		obj.Init();
			
			
		obj.ConstructBuilding();
		}
	}
}
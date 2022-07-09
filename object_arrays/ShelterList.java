package object_arrays;

import java.util.ArrayList;
import java.util.Random;

public class ShelterList {

	public static void main(String[] args) {
		Cat CatsList[] = new Cat[5];
		ArrayList<Cat> CatsArrayList = new ArrayList<Cat>();
		
		CatsList[0] = new Cat("Susie", 2, "Orange Tabby");
		CatsList[1] = new Cat("Oreo", 5, "Black and White");
		CatsList[2] = new Cat("Momo", 9, "Black");
		CatsList[3] = new Cat("Bean", 1, "American Shorthair");
		CatsList[4] = new Cat("Johnson", 4, "Hairless Sphynx");
		//CatsList[5] = new Cat("Extra", 100, "Ghost");
		CatsArrayList.add(CatsList[0]);
		CatsArrayList.add(CatsList[1]);
		CatsArrayList.add(CatsList[2]);
		CatsArrayList.add(CatsList[3]);
		CatsArrayList.add(CatsList[4]);
		CatsArrayList.add(new Cat("Jillu", 3, "Russian Blue"));
		CatsArrayList.add(new Cat("Eeb", 3, "Calico"));
		
		Random r = new Random();
		int randcat = r.nextInt(5);
		
		System.out.println("*** Cat of the Month ***\n");
		System.out.println("Name: " + CatsList[randcat].getName());
		System.out.println("Age: " + CatsList[randcat].getAge() + "");
		System.out.println(CatsList[randcat].toString() + "\n");
		
		System.out.println("\n*** All Cats in this Shelter ***\n");
		
		for (int i = 0; i < CatsArrayList.size(); i++) {
			System.out.println("Name: " + CatsArrayList.get(i).getName() + ", Age: " + CatsArrayList.get(i).getAge() + ", Appearance: " + CatsArrayList.get(i).getColor());
		}
				
		
	}

}

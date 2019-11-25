import java.util.*;
import java.io.*;

public class Intro1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("src//firmy.txt"));
		
		// utworzenie obiektu klasy ArrayList
		ArrayList list=new ArrayList();
		while(sc.hasNextLine()) {
			String firma=sc.nextLine();
			// dodanie kolejnego elementu do kolekcji
			list.add(firma);
		}
		
		// wypisanie wszystkich elementów listy
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		sc.close();
		

	}

}

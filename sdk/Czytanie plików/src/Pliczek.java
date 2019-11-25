import java.util.*;
import java.io.*;
public class Pliczek {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("Plik.txt"));
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine()+" ");
		}
		sc.close();
	}

}

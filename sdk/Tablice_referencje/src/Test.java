
public class Test {
	
	Test(){
		int[] a= {1, 2, 3, 4};
		int[] wynik=dblVal(a);
	
			for(int i=0; i < wynik.length; i++) {
				System.out.println(" " + wynik[i]);
			}
	}
	
	int[] dblVal(int[] tab) {
		 int[] w=new int[tab.length];	// utworzenie tablicy wynikowej,
		 								// o takim samym rozmiarze,
		 								// jak tablica przekazana jako argument
		 
		 for(int i=0; i< w.length; i++) {
			 w[i]=tab[i]*4;
		 }
		 return w;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test();

	}

}

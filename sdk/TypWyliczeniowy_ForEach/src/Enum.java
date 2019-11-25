
public class Enum {
	
		// typ wyliczeniowy
		enum Month {JANUARY, FEB, MARCH, APRIL, MAY, JUNE, JULY,
					AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}
		
		Enum(){
			for(Month m: Month.values()) {
				System.out.print(" "+m);
				if(m==Month.JUNE) System.out.println();
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Enum();
	}

}

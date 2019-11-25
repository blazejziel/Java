public class Koszyk {
		Produkt p;
		int ilosc;
		
		
		Koszyk(){
			p=null;
			ilosc=0;
		}
		
		Koszyk(Produkt p1, int il, int sum){
			p=p1;
			ilosc=il;
		}
		
		void suma() {
			double sum=0;
			sum=p.getPrice()*ilosc;
		}
}

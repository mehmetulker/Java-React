
public class Main {
	public static void main(String[] args) {
		// deðiþken isimlendirme camelCase yapýsý kullanýlýr.
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {

			System.out.println("Dolar düþtü resmi");
		} else if (dolarBugun > dolarDun) {

			System.out.println("Dolar yükseldi resmi");
		} else {

			System.out.println("Dolar eþittir resmi");
		}

		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Çiftçi  Kredisi";
		String kredi5 = "Msb Kredi";
		String kredi6 = "Meb Kredi";
		String kredi7 = "Kültür bakakanlýðý kredisi";
		System.out.println("------------------------------------");

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		System.out.println("------------------------------------");
		String krediler[] = 
			{ "Hýzlý Kredi", "Mutlu emekli kredisi", "Konut kredisi", "Çiftçi  Kredisi", "Msb Kredi",
				"Meb Kredi", "Kültür bakakanlýðý kredisi" };
		int i = 0;
		for (String kredi : krediler) {

			i++;
			System.out.println("-----------------");
			System.out.println((i) + ":" + kredi);

		}
		
		System.out.println("------------------------------------");
		
		for (int j = 0; j < krediler.length; j++) {
			
			System.out.println(krediler[j]);
			
			
		}
		
		System.out.println("------------------------------------");
		
		// Deðer Type
		// Referans Type
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		
		
		System.out.println("------------------------------------");
		int[] sayilar1= {1,2,3,4,5,6};
		int[] sayilar2= {10,20,30,40,50,};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		
		System.out.println(sayilar1[0]);
		
		
		
		System.out.println("------------------------------------");
		
		String sehir1="Ankara";
		String sehir2="Ýstanbul";
		sehir1=sehir2;
		sehir2="Ýzmir";
		System.out.println(sehir1);
		
		
		System.out.println("------------------------------------");
		

	}

}

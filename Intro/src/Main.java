
public class Main {
	public static void main(String[] args) {
		// de�i�ken isimlendirme camelCase yap�s� kullan�l�r.
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {

			System.out.println("Dolar d��t� resmi");
		} else if (dolarBugun > dolarDun) {

			System.out.println("Dolar y�kseldi resmi");
		} else {

			System.out.println("Dolar e�ittir resmi");
		}

		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "�ift�i  Kredisi";
		String kredi5 = "Msb Kredi";
		String kredi6 = "Meb Kredi";
		String kredi7 = "K�lt�r bakakanl��� kredisi";
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
			{ "H�zl� Kredi", "Mutlu emekli kredisi", "Konut kredisi", "�ift�i  Kredisi", "Msb Kredi",
				"Meb Kredi", "K�lt�r bakakanl��� kredisi" };
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
		
		// De�er Type
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
		String sehir2="�stanbul";
		sehir1=sehir2;
		sehir2="�zmir";
		System.out.println(sehir1);
		
		
		System.out.println("------------------------------------");
		

	}

}

package latihan.kalkulator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Kalkulator kalkulator = new Kalkulator();
		
		System.out.println("====Aplikasi Kalkulator Bilangan====");
		System.out.print("Masukan Angka ke-1 : ");
		kalkulator.value1 = reader.nextDouble();
		System.out.print("Masukan Angka ke-2 : ");
		kalkulator.value2 = reader.nextDouble();
		
		System.out.println("");
		System.out.println("Hasil Pertambahan : "+kalkulator.tambahBilangan());
		System.out.println("Hasil Pengurangan : "+kalkulator.kurangBilangan());
		System.out.println("Hasil Perkalian : "+kalkulator.kaliBilangan());
		System.out.println("Hasil Pembagian : "+kalkulator.bagiBilangan());
		System.out.println("Hasil Sisa : "+kalkulator.sisaBilangan());
		reader.close();
	}
	
}

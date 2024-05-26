package kalori_hesaplama_uygulaması;
import java.util.Scanner;

public class bmr_tee_hesap  {
	Scanner giris =new Scanner(System.in);
	
	
	 public double tmhHesapla(String cinsiyet, double kilo, double boy, int yas) {
	        double tmh = 0;
	        if (cinsiyet.contentEquals("ERKEK")) {
	        	tmh = 88.362 + (13.397 * kilo) + (4.799 * boy) - (5.677 * yas);
	        } else if (cinsiyet.contentEquals("KADIN")) {
	        	tmh = 447.593 + (9.247 * kilo) + (3.098 * boy) - (4.330 * yas);
	        }
	        return tmh;
	    }
	 public double tehHesapla(double bmr, int aktiviteDuzeyi) {
	        double teh = 0;
	        switch (aktiviteDuzeyi) {
	            case 1:
	            	teh = bmr * 1.2;
	                break;
	            case 2:
	                teh = bmr * 1.375;
	                break;
	            case 3:
	            	teh = bmr * 1.55;
	                break;
	            case 4:
	            	teh = bmr * 1.725;
	                break;
	            case 5:
	            	teh = bmr * 1.9;
	                break;
	            default:
	                System.out.println("Geçersiz aktivite düzeyi!");
	        }
	        return teh;
	    }

}

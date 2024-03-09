


	import java.util.Scanner;

	public class ATM_Uygulaması {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double bakiye = 0;

	        while (true) {
	            System.out.println("1. Para Yatır");
	            System.out.println("2. Para Çek");
	            System.out.println("3. Bakiye Sorgula");
	            System.out.println("4. Çıkış Yap");

	            System.out.print("Lütfen bir işlem seçin: ");
	            int secim = scanner.nextInt();

	            switch (secim) {
	                case 1:
	                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
	                    double yatirilanMiktar = scanner.nextDouble();
	                    bakiye += yatirilanMiktar;
	                    System.out.println("Para yatırma işlemi başarıyla gerçekleştirildi. Yeni bakiyeniz: " + bakiye);
	                    break;
	                case 2:
	                    System.out.print("Çekmek istediğiniz miktarı girin: ");
	                    double cekilenMiktar = scanner.nextDouble();
	                    if (cekilenMiktar > bakiye) {
	                        System.out.println("Hesabınızda yeterli bakiye bulunmamaktadır.");
	                    } else {
	                        bakiye -= cekilenMiktar;
	                        System.out.println("Para çekme işlemi başarıyla gerçekleştirildi. Yeni bakiyeniz: " + bakiye);
	                    }
	                    break;
	                case 3:
	                    System.out.println("Bakiyeniz: " + bakiye);
	                    break;
	                case 4:
	                    System.out.println("Çıkış yapılıyor. İyi günler!");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
	            }
	        }
	    }
	  }
	


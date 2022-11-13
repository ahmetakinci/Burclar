import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        int day;

        System.out.print("Hangi ayda doğdunuz: ");
        month = scanner.next();

        System.out.print("Ayın kaçıncı gününde doğdunuz: ");
        day = scanner.nextInt();

        if (month.equals("ocak")) {
            if (0 < day && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Oğlak");
                } else {
                    System.out.println("Burcunuz Kova");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else if (month.equals("şubat")) {
            if (0 < day && day <= 28) {
                if (day <= 19) {
                    System.out.println("Burcunuz Kova");
                } else {
                    System.out.println("Burcunuz Balıkı");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else if (month.equals("mart")) {
            if (0 < day && day <= 31) {
                if (day <= 20) {
                    System.out.println("Burcunuz Balık");
                } else {
                    System.out.println("Burcunuz Koç");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else if (month.equals("nisan")) {
            if (0 < day && day <= 30) {
                if (day <= 20) {
                    System.out.println("Burcunuz Koç");
                } else {
                    System.out.println("Burcunuz Boğa");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else if (month.equals("mayıs")) {
            if (0 < day && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Boğa");
                } else {
                    System.out.println("Burcunuz İkizler");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else if (month.equals("haziran")) {
            if (0 < day && day <= 30) {
                if (day <= 22) {
                    System.out.println("Burcunuz İkizler");
                } else {
                    System.out.println("Burcunuz Yengeç");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else if (month.equals("temmuz")) {
            if (0 < day && day <= 31) {
                if (day <= 22) {
                    System.out.println("Burcunuz Yengeç");
                } else {
                    System.out.println("Burcunuz Aslan");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else if (month.equals("ağustos")) {
            if (0 < day && day <= 31) {
                if (day <= 22) {
                    System.out.println("Burcunuz Aslan");
                } else {
                    System.out.println("Burcunuz Başak");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else if (month.equals("eylül")) {
            if (0 < day && day <= 30) {
                if (day <= 22) {
                    System.out.println("Burcunuz Başak");
                } else {
                    System.out.println("Burcunuz Terazi");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else if (month.equals("ekim")) {
            if (0 < day && day <= 31) {
                if (day <= 22) {
                    System.out.println("Burcunuz Terazi");
                } else {
                    System.out.println("Burcunuz Akrep");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else if (month.equals("kasım")) {
            if (0 < day && day <= 30) {
                if (day <= 21) {
                    System.out.println("Burcunuz Akrep");
                } else {
                    System.out.println("Burcunuz Yay");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else if (month.equals("aralık")) {
            if (0 < day && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Yay");
                } else {
                    System.out.println("Burcunuz Oğlak");
                }
            } else {
                System.out.println("Geçersiz sayı girişi...");
            }
        } else {
            System.out.println("Geçersiz seçim...");

        }
    }
}

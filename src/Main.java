import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, day;
        System.out.println("Kaçıncı ayca doğdunuz : ");
        month = sc.nextInt();

        System.out.println("Kaçıncı gün doğdunuz : ");
        day = sc.nextInt();

        if (month <= 12 && month >= 1){
            if (day <=31 && day>= 1){
                if(month == 1){
                    if(day <=21){
                        System.out.println("Burcunuz Oğlak.");
                    }
                    else {
                        System.out.println("Burcunuz Kova.");
                    }
                }
                if(month == 2){
                    if(day <=19){
                        System.out.println("Burcunuz Kova.");
                    }
                    else {
                        System.out.println("Burcunuz Balık.");
                    }
                }
                if(month == 3){
                    if(day <=20){
                        System.out.println("Burcunuz Balık.");
                    }
                    else {
                        System.out.println("Burcunuz Koç.");
                    }
                }
                if(month == 4){
                    if(day <=21){
                        System.out.println("Burcunuz Koç.");
                    }
                    else {
                        System.out.println("Burcunuz Boğa.");
                    }
                }
                if(month == 5){
                    if(day <=21){
                        System.out.println("Burcunuz Boğa.");
                    }
                    else {
                        System.out.println("Burcunuz İkizler.");
                    }
                }
                if(month == 6){
                    if(day <=22){
                        System.out.println("Burcunuz İkizler.");
                    }
                    else {
                        System.out.println("Burcunuz Yengeç.");
                    }
                }
                if(month == 7){
                    if(day <=22){
                        System.out.println("Burcunuz Yengeç.");
                    }
                    else {
                        System.out.println("Burcunuz Aslan.");
                    }
                }
                if(month == 8){
                    if(day <=22){
                        System.out.println("Burcunuz Aslan.");
                    }
                    else {
                        System.out.println("Burcunuz Başak.");
                    }
                }
                if(month == 9){
                    if(day <=22){
                        System.out.println("Burcunuz Başak.");
                    }
                    else {
                        System.out.println("Burcunuz Terazi.");
                    }
                }
                if(month == 10){
                    if(day <=22){
                        System.out.println("Burcunuz Terazi.");
                    }
                    else {
                        System.out.println("Burcunuz Akrep.");
                    }
                }
                if(month == 11){
                    if(day <=21){
                        System.out.println("Burcunuz Akrep.");
                    }
                    else {
                        System.out.println("Burcunuz Yay.");
                    }
                }
                if(month == 12){
                    if(day <=21){
                        System.out.println("Burcunuz Yay.");
                    }
                    else {
                        System.out.println("Burcunuz Oğlak.");
                    }
                }

            }
            else {
                System.out.println("Günü hatalı girdiniz.");
            }

        }
        else {
            System.out.println("Ay'ı hatalı girdiniz.");
        }
    }
}

import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your birth of month:  ");
        month = input.nextInt();
        System.out.println("Please enter your birth of day:  ");
        day = input.nextInt();

        if (month == 1){
            if (day >=1 && day <= 31){
                if ( day < 22){
                    System.out.println("Your Horoscope CAPRİCORN");
                }else{
                    System.out.println("Your Horoscope AQUARIUS");
                }
            }
        }
        if( month == 2) {
            if (day >= 1 && day <= 28) {
                if (day <= 20){
                    System.out.println("Your Horoscope AQUARIUS");
                }else{
                    System.out.println("Your Horoscope PISCES");
                }
            }
        }
        if (month == 3){
            if (day >=1 && day <= 31){
                if ( day < 21){
                    System.out.println("Your Horoscope PISCES");
                }else{
                    System.out.println("Your Horoscope ARIES");
                }
            }
        }
        if (month == 4){
            if (day >=1 && day <= 30){
                if ( day < 21){
                    System.out.println("Your Horoscope ARIES");
                }else{
                    System.out.println("Your Horoscope TAURUS");
                }
            }
        }
        if (month == 5){
            if (day >=1 && day <= 31){
                if ( day < 22){
                    System.out.println("Your Horoscope TAURUS");
                }else{
                    System.out.println("Your Horoscope GEMINI");
                }
            }
        }
        if (month == 6){
            if (day >=1 && day <= 30){
                if ( day < 23){
                    System.out.println("Your Horoscope GEMINI");
                }else{
                    System.out.println("Your Horoscope CANCER");
                }
            }
        }
        if (month == 7){
            if (day >=1 && day <= 31){
                if ( day < 23){
                    System.out.println("Your Horoscope CANCER");
                }else{
                    System.out.println("Your Horoscope LEO");
                }
            }
        }
        if (month == 8){
            if (day >=1 && day <= 31){
                if ( day < 23){
                    System.out.println("Your Horoscope LEO");
                }else{
                    System.out.println("Your Horoscope VIRGO");
                }
            }
        }
        if (month == 9){
            if (day >=1 && day <= 30){
                if ( day < 23){
                    System.out.println("Your Horoscope VIRGO");
                }else{
                    System.out.println("Your Horoscope LIBRA");
                }
            }
        }
        if (month == 10){
            if (day >=1 && day <= 31){
                if ( day < 23){
                    System.out.println("Your Horoscope LIBRA");
                }else{
                    System.out.println("Your Horoscope SCORPIO");
                }
            }
        }
        if (month == 11){
            if (day >=1 && day <= 30){
                if ( day < 22){
                    System.out.println("Your Horoscope SCORPIO");
                }else{
                    System.out.println("Your Horoscope SAGITTARIUS");
                }
            }
        }
        if (month == 12){
            if (day >=1 && day <= 31){
                if ( day < 22){
                    System.out.println("Your Horoscope SAGITTARIUS");
                }else{
                    System.out.println("Your Horoscope CAPRICORN");
                }
            }
        }

    }
}

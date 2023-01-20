import java.util.Scanner;

public class ${NAME} {
    public static void main(String[] args) {
        String answer;
        do {
            Scanner select = new Scanner(System.in);
            System.out.println("Välkommen!\n Vill du köpa Skor eller väska?");
            answer = select.nextLine();
            if (answer.equals("Skor")) {
                System.out.println("välj önskade produkt" + ShoeList.Skor);
                String answer1 = select.nextLine();
                System.out.println("Du har beställt :" + answer1 + " " + "\n Tack för  beställningen");
            } else {
                System.out.println("välj önskade produkt" + BagList.väska);
                String answer2 = select.nextLine();
                System.out.println("Du har beställt :" + answer2 + "\n " +
                        "Tack för  beställningen");
            } // else
            System.out.println(" Vill du beställa igen?");
            answer = select.nextLine().toLowerCase();
        } while (answer.equals("ja"));
        System.out.println(" Tack , vällkomenåter");


    }
}
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in); //Girdi almak için Scanner ekledik ve importlandı.

        //Kullanıcıdan girdi aldık.
        System.out.print("Write your birth year ? ");
        int age = input.nextInt();

        //şimdi işlem yapacağız.
        int result = age % 12 ;

        //cevap kısmı oluşturdum.
        String msg = ("Your Chinese Zodiac Sign : ");

        //isimleri switchle girdim.
        switch (result) {
            case  0:
                System.out.print(msg + "Monkey");
                break;
            case  1:
                System.out.print(msg + "Cockerel");
                break;
            case  2:
                System.out.print(msg + "Dog");
                break;
            case  3:
                System.out.print(msg + "Pig");
                break;
            case  4:
                System.out.print(msg + "Mouse");
                break;
            case  5:
                System.out.print(msg + "Bullock");
                break;
            case  6:
                System.out.print(msg + "Tiger");
                break;
            case  7:
                System.out.print(msg + "Rabbit");
                break;
            case  8:
                System.out.print(msg + "Dragon");
                break;
            case  9:
                System.out.print(msg + "Snake");
                break;
            case  10:
                System.out.print(msg + "Horse");
                break;
            case  11:
                System.out.print(msg + "Sheep");
                break;











        }


    }
}

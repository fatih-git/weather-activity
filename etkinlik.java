import java.util.Scanner;

/**
 * @author fatih-git
 */

public class etkinlik {

    public static void main(String[] args) {

        int heat;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        heat=input.nextInt();

        if (heat>25){

            System.out.println("Yüzmeye gidebilirsiniz.");

        }else if(heat>=5 && heat<15){

            System.out.println("Sinemaya gidebilirsinz.");

            if (heat>=10){
                System.out.println("Pikniğe de gidebilirsiniz.");
            }

        }else if(heat>=15){
            System.out.println("Pikniğe gidebilirsiniz.");
        }else{
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }

    }

}

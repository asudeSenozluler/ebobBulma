import java.util.Scanner;

public class Main {
    public static int ebobBul(int s1,int s2){
        int ebob=1;
        for (int i=1;i<=s1 && i<=s2;i++){
            if (s1%i==0 && s2%i==0){
                ebob=i;

            }
        }
        return ebob;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci Sayı: ");
        int birinciSayi=scanner.nextInt();
        System.out.println("İkinci Sayı: ");
        int ikinciSayi=scanner.nextInt();
        System.out.println("İki sayının ebobu: "+ ebobBul(birinciSayi,ikinciSayi));

    }
}

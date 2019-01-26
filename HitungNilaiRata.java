import java.util.Scanner;

/**
 *
 * @author Lovynazwa
 */
public class HitungNilaiRata {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
                int[] nilai = new int[3];
		for(int i = 0; i <= 2; i++)
		{
                    
                        System.out.print("Masukan data ke -" + i + " : ");
                        nilai[i] = input.nextInt();
                }
                int jumlah = 0;
                for(int i = 0; i <= 2; i++)
                {
                        jumlah = nilai[i] + jumlah;
                }
                int rata;
                rata = jumlah / 3;
                System.out.print("Rata-Rata data tersebut adalah "+rata);
                if(rata >= 60){
                    System.out.print(" :-)");
                }
                else
                {
                    System.out.print(" :-(");
                }
    }
    
}

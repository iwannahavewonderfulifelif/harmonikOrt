//for (int row = 0; row < matris.length; row++) {
//   for (int column = 0; column < matris[row].length; column++) {
//       System.out.print(matris[row][column] + " ");
//}
//    System.out.println();
//}

import java.util.Arrays;
public class Arrayler {

    public static void main(String[] args) {

    double[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum+=1/numbers[i];
            System.out.println("Toplamı: "+sum);//işlemin doğru gitme durumunu kontrol etmek için
        }

        System.out.println("Harmonik Ortalaması: "+numbers.length/sum);
    }}




//            dizi=1/numbers[i];
//            System.out.println("sayılar: "+dizi);
//           sum +=dizi;


//İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.

       /* int[][] matris=new int[5][6];
        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[row].length; column++) {
                matris[row][column] = (int) (Math.random() * 100);
            }}
        for (int row = 0; row < matris.length; row++) {
   for (int column = 0; column < matris[row].length; column++) {
       System.out.print(matris[row][column] + " ");
}
    System.out.println();
} */



        //Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
        /*int[][] matris = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matris.length + " rows and "
                + matris[0].length + " columns: ");
        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[row].length; column++) {
                matris[row][column] = input.nextInt();
            }
        }
        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[row].length; column++) {
                System.out.print(matris[row][column] + " ");
            }
            System.out.println();

        }
*/


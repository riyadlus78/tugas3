/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package modul1_202457201052;

/**
 *
 * @author MysticWave
 */
public class ketik_ulang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };
        int jumlahElemen = 0;
        int totalElemen = 0;
        for (int[] data1 : data) {
            for (int b = 0; b < data1.length; b++) {
                System.out.print(data1[b] + " ");
                jumlahElemen = jumlahElemen + data1[b];
                totalElemen = totalElemen + 1;
            }
            System.out.print("\n");
        }
        System.out.println("----------------");
        double rerata = jumlahElemen/totalElemen; 
        System.out.println("Jumlah Elemen : " + jumlahElemen);
        System.out.println("totalElemen : " + totalElemen);
        System.out.println("Nilai Rata-Rata : " + rerata);
    }

        }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modul1_202457201052;
import javax.swing.JOptionPane;

/**
 *
 * @author rizan
 */
public class menukar_nilai {
    public static void main(String[] args) {
        int data[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };
        // Input indeks elemen yang ingin di ubah nilai
        int baris = Integer.parseInt(JOptionPane.showInputDialog("masukkan baris"));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("masukkan kolom"));
        //Input nilai baru untuk di tukar
        int nilaiBaru = Integer.parseInt(JOptionPane.showInputDialog("masukkan nilai baru"));
        //Tukar nilai pada posisi yang di tentukan
        data[baris][kolom] = nilaiBaru;
        //Tampilkan array setelah perubahan
        
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b< data[0].length; b++) {
                System.out.print(data[a][b] + " ");
            }
            System.out.println("\n");
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modul1_202457201052;

/**
 *
 * @author rizan
 */
public class data_array {
    public static void main(String[] args) {
        String data [][] ={
            {" NAMA","\tALAMAT","\t\tTELEPON\n"},
            {"====================================\n"},
            {"ABDUL","\tKEDIRI","\t\t085644666899\n"},
            {"KUSNO","\tTRENGGALEK","\t085646668992\n"},
            {"PONIRAN","BOJONEGORO","\t085646668999\n"}
        };
        for (int a = 0; a < data.length; a++){
            for (int b = 0; b < data[a].length; b++){
                System.out.print(data[a][b]+" ");
            }
        }
    }

}

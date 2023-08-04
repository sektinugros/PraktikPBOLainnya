/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w05_ArrayOfObject;

/**
 *
 * @author LENOVO
 */
public class PenggunaanArray {
    public static void main(String[] args) {
        String cobaArray[][] = new String[2][3];
        int counter = 0;
        
        //mengisi array
        for(int i=0;i<2;i++){ //ini untuk baris
            for(int j=0;j<3;j++){ //ini untuk kolom
                cobaArray [i][j] = String.valueOf(counter);              
                counter++;
            
            
            }
        }
        
        //menampilkan Array
        for(int i=0;i<2;i++){ //ini untuk baris
            for(int j=0;j<3;j++){ //ini untuk kolom
                System.out.print(cobaArray [i][j]+" ");
                
            }
            System.out.println("");
        }
        
        
    }
            
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w03_overload;

/**
 *
 * @author LENOVO
 */
public class penjumlahan {
    public double hasil;
    
    /**
     *
     * @param inputA
     * @return
     */
    public double jumlah(double inputA){
        return hasil = Math.pow( inputA, 3);
    }
    
    public double jumlah(){
        return hasil = Math.pow(3, 2);
    }
    
    public void showHasil(){
        System.out.println("hasilnya berikut : " + hasil);
    }
    
    public static void main(String[] args) {
        penjumlahan ju = new penjumlahan();
        ju.jumlah(2);
        ju.showHasil();
      
        ju.jumlah();
        ju.showHasil();
    }
}

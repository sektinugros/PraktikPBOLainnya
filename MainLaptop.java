/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w05_ArrayOfObject;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MainLaptop {
    
    public static void main(String[] args) {
        Laptop [] laptop = new Laptop[2];
        
        for (int i=0;i<laptop.length;i++){
            System.out.println("model Laptop: ");
            Scanner scanner = new Scanner(System.in);
            String produk = scanner.next();
            
            laptop[i] = new Laptop();
            laptop[i].setBrand(produk);
            
        }
    }
}

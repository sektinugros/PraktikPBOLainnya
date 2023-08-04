/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w03_overload;

/**
 *
 * @author LENOVO
 */
public class Exponential {
   
    public double hasil;
    
    //memakai return

    /**
     *
     * @param inputY
     * @return
     */
    public double pangkat(double inputY){
         return hasil = Math.pow(inputY, 3);
        
    }
      public double pangkat(){
        return hasil = Math.pow(4, 3);
    }
        // mamakai void
    public void showHAsil(){
        System.out.println("Hasil bilangan pangkatnya : " + hasil ); 
          
    }
            // Exponensial = Construktor
    public static void main(String[] args) {
        Exponential exponential = new Exponential();
        exponential.pangkat(2); 
        exponential.showHAsil();
        
        exponential.pangkat();
        exponential.showHAsil();
    }
}

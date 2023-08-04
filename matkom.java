/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w03_overload;

/**
 *
 * @author LENOVO
 */
public class matkom {
     public double jawab;
       
    
    public double pangkat(double inputA){
        return jawab = Math.pow(3, 3);
    }
   
    public double pangkat(){
    return jawab = Math.pow(4, 2);
    }
    public void showJawab(){
            System.out.println("jawabannya" + jawab);
        }
        
    public static void main(String[] args) {
        matkom matkome = new matkom ();
        matkome.pangkat();
        matkome.showJawab();
        
        
        matkome.pangkat();
        matkome.showJawab();
        
        
        
                }
}

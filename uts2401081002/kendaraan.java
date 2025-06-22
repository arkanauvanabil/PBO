/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2401081002;

/**
 *
 * @author ARKAN_AUVA
 */
/**SOAL A */
public class kendaraan {
    
    private double jmlRoda;
    private double warna;
            
    public kendaraan(){
        super();
        this.jmlRoda=0;
    }
    public kendaraan(double warna )
    {
      super();
      this.jmlRoda=warna;
        
    }
    public void setjmlRoda(double jmlRoda)
    {
        this.jmlRoda=jmlRoda;
        
    }
    public double getjmlRoda()
    {
        
        return jmlRoda;
        
    }
    public void setWarna(){
        this.warna=warna;
    }
    public void getwarna(){
        this.warna=warna;
    }
            
            


    
}

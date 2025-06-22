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
public class Taksi {
    
    private double tarifAwal;
    private double TarifPerKm;
    private double Tarifawal;
            
    public Taksi(){
        super();
        this.tarifAwal=1000;
    }
    public Taksi(double TarifPerKm )
    {
      super();
      this.Tarifawal=TarifPerKm;
        
    }
    public void setTarifAwal(double TarifPerKm)
    {
        this.Tarifawal=TarifPerKm;
        
    }
    public double getTarifAwal()
    {
        
        return TarifPerKm;
        
    }
    public void setTarifPerKm(){
       ;
    }
    public void getTarifPerKm(){
       
    }
            
}

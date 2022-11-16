/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package jesusruiz.calculadoracombustible;

/**
 *
 * Clase que calcula el combustible para una carrera
 * 
 * 
 * @author JesusRuizDev
 */
public class CalculadoraCombustible {

    public CalculadoraCombustible(int timeRace,double fuelLap,double timeLap){
        
        this.timeRace = timeRace;
        this.fuelLap = fuelLap;
        this.timeLap = timeLap;     
        
    }
    
   
    // Metodo que calcula combustible
    
    public int CalculaCombustible(){
        
        double fuelRace = ((timeRace*60)/timeLap) * fuelLap + (2 * fuelLap); // formula
        
        int fuelraceInt = (int) fuelRace;  // castea double a integer para resultado final
        
        return fuelraceInt;
        
    }
    
    // zona variables
    int timeRace;
    double fuelLap,timeLap;
    
}

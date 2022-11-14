/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package jesusruiz.calculadoracombustible;

/**
 *
 * @author jesus
 */
public class CalculadoraCombustible {

    public CalculadoraCombustible(int minutos,double fuelLap,double timeLap){
        
        this.minutos = minutos;
        this.fuelLap = fuelLap;
        this.timeLap = timeLap;
        
        
    }
    
    // Metodo que calcula combustible
    
    public double Calcula(){
        
        //int fuelRace = 0;
        
        Double fuelRace = ((minutos*60)/timeLap) * fuelLap + (2 * fuelLap);
        
        //int fuelrace2 = Double.parseDouble(fuelRace);
        
        //System.out.print(fuelrace2);
                
        
        
        return fuelRace;
        
    }
    
    // zona variables
    int minutos;
    double fuelLap,timeLap;
    
}

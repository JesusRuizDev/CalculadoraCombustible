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

    public CalculadoraCombustible(int minutos,int fuelLap,int timeLap){
        
        this.minutos = minutos;
        this.fuelLap = fuelLap;
        this.timeLap = timeLap;
        
        
    }
    
    // Metodo que calcula combustible
    
    public double Calcula(){
        
        int fuelRace = 0;
        
        fuelRace = ((minutos*60)/timeLap * fuelLap + (2 * fuelLap));
        System.out.print(fuelRace);
                
        
        
        return fuelRace;
        
    }
    
    // zona variables
    int minutos;
    int fuelLap,timeLap;
    
}

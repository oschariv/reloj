
/**
 * Write a description of class ClockDisplay here.
 * 
 * @oschariv (Oscar Charro Rivera) 
 * @1.0 (10/11/2016)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay hora;
    private NumberDisplay min;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        hora = new NumberDisplay(24);
        min = new NumberDisplay(60);
    }

    /**
     * Metodo para establecer una hora determinada al ClockDisplay.
     */
    public void setTiempo(int horas, int minutos)
    {
        hora.setValue(horas);
        min.setValue(minutos);
    }
    
    /**
     * Metodo avanzarMin para avanzar un minuto a la hora establecida. 
     */
    public void avanzarMin()
    {
        min.increment();
        if(min.getValue() == 0){
            hora.increment();
        }
    }
}

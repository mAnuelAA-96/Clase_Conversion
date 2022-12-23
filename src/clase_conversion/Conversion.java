
/**
 * Manuel Flores
 */

package clase_conversion;

public class Conversion {
    private double valor;
    private double ratio;
    private double cambio;
    
    
    
    Conversion (double valor, double ratio, double cambio){
        this.valor = valor;
        this.ratio = ratio;
        this.cambio = this.valor * this.ratio;
    }
    
    //getters
    public double getValor(){
        return valor;
    }

    public double getRatio(){
        return ratio;
    }
    
    public double getCambio(){
        return cambio;
    }
    
    //setters
    public void setValor(double nuevoValor){
        if (nuevoValor < 0){
            ES.msgln("La cantidad no puede ser menor que 0");
        }else{
            valor = nuevoValor;
        }
    }

    public void setRatio(double nuevoRatio){
        if (nuevoRatio < 0){
            ES.msgln("El ratio no puede ser menor que 0");
        }else{
            ratio = nuevoRatio;
        }
    }
    
    public void setCambio (double valor, double ratio){
        cambio = valor * ratio;
    }
    public void hacerCambio(double nuevoValor, double nuevoRatio){
        valor = nuevoValor;
        ratio = nuevoRatio;
        setCambio(valor, ratio);
    }
    
    public void dolarAEuro(){
        setCambio(valor, ratio);
    }
    
}//fin class Conversion
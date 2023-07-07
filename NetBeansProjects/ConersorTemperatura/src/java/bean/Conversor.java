package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Conversor {
    double celsius;
    double fahrenheit;
    boolean naoCalculado = true;
    
    public Conversor() {
        
    }
    
    public void converterCpF() {
        fahrenheit = (celsius * 9 / 5) + 32;
        naoCalculado = false;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public boolean isNaoCalculado() {
        return naoCalculado;
    }

    public void setNaoCalculado(boolean naoCalculado) {
        this.naoCalculado = naoCalculado;
    }
    
    
}

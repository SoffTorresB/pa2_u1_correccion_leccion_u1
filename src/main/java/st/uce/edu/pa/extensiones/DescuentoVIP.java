package st.uce.edu.pa.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoVIP implements Descuento {
 
    @Override
    public double calcularDescuento(double precio) {
        return precio - (precio*0.10);
    }
 
}
 
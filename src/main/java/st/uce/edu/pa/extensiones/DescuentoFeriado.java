package st.uce.edu.pa.extensiones;

import jakarta.enterprise.context.ApplicationScoped;
 
@ApplicationScoped
public class DescuentoFeriado implements Descuento {
 
    @Override
    public double calcularDescuento(double precio) {
        return precio - (precio * 0.15);
    }
 
}
 
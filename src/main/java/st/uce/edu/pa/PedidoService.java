package st.uce.edu.pa;

import jakarta.enterprise.context.ApplicationScoped;
import st.uce.edu.pa.extensiones.Descuento;
import st.uce.edu.pa.interceptores.MedirTiempo;
import st.uce.edu.pa.interceptores.Notificacion;

@ApplicationScoped
public class PedidoService {

    @MedirTiempo 
    @Notificacion
    public void procesarPedido(Pedido pedido, Descuento descuento) {
        pedido.setPrecio(descuento.calcularDescuento(pedido.getPrecio()));
        System.out.println("Realizando pedido: "+pedido.getCodigo()+" - "+pedido.getProducto() + " - Precio: " + pedido.getPrecio());
        // Lógica para realizar el pedido
    }
}
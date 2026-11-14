package st.uce.edu.pa;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import st.uce.edu.pa.extensiones.DescuentoFeriado;
import st.uce.edu.pa.extensiones.DescuentoNormal;
import st.uce.edu.pa.extensiones.DescuentoVIP;


@QuarkusMain
public class Main implements QuarkusApplication {
 
    @Inject
    private PedidoService pS;
 
    @Inject
    private DescuentoNormal descuentoNormal;
 
    @Inject
    private DescuentoVIP descuentoVIP;
 
    @Inject
    private DescuentoFeriado descuentoFeriado;
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }
 
    @Override
    public int run(String... args) throws Exception {
 
        Pedido p1 = new Pedido("P001", "Laptop", 1000);
        Pedido p2 = new Pedido("P002", "Teclado", 200);
        Pedido p3 = new Pedido("P003", "Mouse", 10);
 
        pS.procesarPedido(p1, descuentoFeriado);
        pS.procesarPedido(p2, descuentoNormal);
        pS.procesarPedido(p3, descuentoVIP);
 
 
        System.out.println("Codigo proporcionado por el docente");
        return 0;
    }
}
 
 

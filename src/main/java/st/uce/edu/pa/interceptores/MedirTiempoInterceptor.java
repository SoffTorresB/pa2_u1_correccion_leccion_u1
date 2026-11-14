package st.uce.edu.pa.interceptores;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
 
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
@MedirTiempo
public class MedirTiempoInterceptor {
 
    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception{
       
        long inicio = System.currentTimeMillis();
        Object resultado = context.proceed();
        long fin = System.currentTimeMillis() - inicio;
 
        System.out.println("Tiempo de ejecucion: " + fin + " ms");
        return resultado;
    }
}
 
package st.uce.edu.pa.interceptores;
import jakarta.inject.Inject;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import st.uce.edu.pa.NotificacionMailService;
 
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
@Notificacion
public class NotificacionInterceptor {
 
    @Inject
    private NotificacionMailService notificacionMailService;
 
    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception{
 
        Object resultado = context.proceed();
        notificacionMailService.enviarNotificacion("");
        return resultado;
    }
}
 

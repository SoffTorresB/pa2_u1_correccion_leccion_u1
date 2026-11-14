package st.uce.edu.pa;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificacionMailService {

//Metodo enviarNotificacion
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por correo electrónico: " + mensaje);
    }
}

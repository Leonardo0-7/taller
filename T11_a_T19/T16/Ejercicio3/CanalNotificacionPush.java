package T16.Ejercicio3;

public class CanalNotificacionPush implements CanalEnvio { 
    @Override
    public void enviarMensaje(String destinatario, String notita) { 
        System.out.println("Enviando notificacion push a " + destinatario + " con el notita: " + notita);
    }
}

package T16.Ejercicio3;

public class Prueba { 
    public static void Principal(String[] args) {
        CanalEnvio correo = new CanalCorreo(); 
        CanalEnvio sms = new CanalSMS();
        CanalEnvio notificacionPush = new CanalNotificacionPush(); 

        correo.enviarMensaje("email@prueba.com", "Hola, este es un correo");
        sms.enviarMensaje("124476789", "Hola, este es un SMS");
        notificacionPush.enviarMensaje("usuario124", "Hola, esta es una notificacion push");
    }
}

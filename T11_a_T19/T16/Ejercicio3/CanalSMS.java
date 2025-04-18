package T16.Ejercicio3;

public class CanalSMS implements CanalEnvio { 
    @Override
    public void enviarMensaje(String destinatario, String notita) { 
        System.out.println("Enviando SMS a " + destinatario + " con el notita: " + notita);
    }
}

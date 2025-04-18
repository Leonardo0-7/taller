package T16.Ejercicio3;

public class CanalCorreo implements CanalEnvio { 
    @Override
    public void enviarMensaje(String destinatario, String notita) {
        System.out.println("Enviando correo a " + destinatario + " con el notita: " + notita);
    }
}


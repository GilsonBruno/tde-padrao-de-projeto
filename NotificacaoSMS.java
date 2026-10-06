package atividade2;

/**
 * Canal concreto: envio por SMS.
 */
public class NotificacaoSMS implements CanalNotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] Enviando: " + mensagem);
    }
}

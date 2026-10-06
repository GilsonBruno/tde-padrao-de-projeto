package atividade2;

/**
 * Canal concreto: envio por e-mail.
 */
public class NotificacaoEmail implements CanalNotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL] Enviando: " + mensagem);
    }
}

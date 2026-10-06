package atividade2;

/**
 * Canal concreto: envio por Telegram.
 *
 * Prova do OCP: este canal foi adicionado DEPOIS, sem nenhuma
 * alteração no ServicoNotificacao — apenas uma nova implementação
 * da interface CanalNotificacao.
 */
public class NotificacaoTelegram implements CanalNotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("[TELEGRAM] Enviando: " + mensagem);
    }
}

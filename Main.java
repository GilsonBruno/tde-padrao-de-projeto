package atividade2;

/**
 * ATIVIDADE 2 — Demonstração: envios válidos e tratamento de mensagem inválida.
 */
public class Main {

    public static void main(String[] args) {
        // Envios válidos em diferentes canais (polimorfismo em ação)
        ServicoNotificacao porEmail = new ServicoNotificacao(new NotificacaoEmail());
        ServicoNotificacao porSms = new ServicoNotificacao(new NotificacaoSMS());
        ServicoNotificacao porTelegram = new ServicoNotificacao(new NotificacaoTelegram());

        porEmail.notificar("Bem-vindo ao sistema, Gilson!");
        porSms.notificar("Seu código de verificação é 4821.");
        porTelegram.notificar("Sua fatura mensal está disponível.");

        // Tentativa com mensagem inválida (vazia) — exceção tratada
        try {
            porEmail.notificar("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Envio rejeitado: " + e.getMessage());
        }

        // Tentativa com mensagem nula — exceção tratada
        try {
            porSms.notificar(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Envio rejeitado: " + e.getMessage());
        }
    }
}

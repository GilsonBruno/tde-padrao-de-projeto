package atividade2;

/**
 * ATIVIDADE 2 — Coordenador de envio (SRP + OCP + Encapsulamento).
 *
 * - SRP: só coordena o envio; não sabe COMO cada canal envia.
 * - OCP: recebe qualquer CanalNotificacao via injeção de dependência;
 *   novos canais não exigem alteração aqui (sem if/else de tipo).
 * - Encapsulamento/Validação: rejeita mensagens nulas ou vazias
 *   lançando IllegalArgumentException.
 */
public class ServicoNotificacao {

    private final CanalNotificacao canal;

    public ServicoNotificacao(CanalNotificacao canal) {
        if (canal == null) {
            throw new IllegalArgumentException("Canal de notificação não pode ser nulo.");
        }
        this.canal = canal;
    }

    public void notificar(String mensagem) {
        validar(mensagem);
        canal.enviar(mensagem);
    }

    private void validar(String mensagem) {
        if (mensagem == null || mensagem.trim().isEmpty()) {
            throw new IllegalArgumentException("Mensagem não pode ser nula ou vazia.");
        }
    }
}

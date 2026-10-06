package atividade2;

/**
 * ATIVIDADE 2 — Abstração do canal de notificação (OCP/Polimorfismo).
 *
 * Novos canais são adicionados criando novas implementações desta
 * interface, sem modificar o ServicoNotificacao.
 */
public interface CanalNotificacao {

    void enviar(String mensagem);
}

package atividade1;

import java.util.Random;

/**
 * ATIVIDADE 1 — SRP: regra de negócio isolada em um serviço.
 *
 * A autenticação é uma responsabilidade diferente de "ser um usuário",
 * portanto vive em sua própria classe. Se a regra de autenticação mudar
 * (ex.: hash de senha, bloqueio por tentativas), Usuario não é tocada.
 */
public class ServicoAutenticacao {

    private final Random random = new Random();

    /**
     * Simula a autenticação: a senha precisa conferir E o "servidor"
     * responde com 90% de chance de sucesso (simulação aleatória).
     *
     * @param usuario       usuário a ser autenticado
     * @param senhaDigitada senha informada na tentativa de login
     * @return true se autenticado com sucesso
     */
    public boolean autenticar(Usuario usuario, String senhaDigitada) {
        if (usuario == null || senhaDigitada == null) {
            return false;
        }
        boolean senhaConfere = usuario.getSenha().equals(senhaDigitada);
        boolean servidorRespondeuOk = random.nextDouble() < 0.90; // 90% de chance
        return senhaConfere && servidorRespondeuOk;
    }
}

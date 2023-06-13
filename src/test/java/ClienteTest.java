import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteTest {

    @Test
    void deveElogiarSecretaria() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece o contato. A empresa respondeu sua demanda conforme a mensagem a seguir: A empresa agradece a mensagem: Ótimo atendimento",
                cliente.elogiarEmpresa("Ótimo atendimento"));
    }

    @Test
    void deveReclamarSecretaria() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece o contato. A empresa respondeu sua demanda conforme a mensagem a seguir: A empresa vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                cliente.reclamarEmpresa("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirSecretaria() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece o contato. A empresa respondeu sua demanda conforme a mensagem a seguir: A empresa vai analisar a sugestão: Ampliar horário funcionamento",
                cliente.sugerirEmpresa("Ampliar horário funcionamento"));
    }

}
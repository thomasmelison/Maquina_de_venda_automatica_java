public class Demonstracao_Maquina {
    public static void main(String[] args) {
        
        MaquinaDeVendas m1 = new MaquinaDeVendas(10, 15); // cria uma máquina com 10 latinhas e 15 salgadinhos.
        m1.acessaItens(); // Imprime "10 latas e 15 salgadinhos disponíveis na máquina."
        m1.acessaCredito(); // Imprime "Crédito atual: 0."
        m1.solicitaReembolso(5); // Imprime "Crédito atual de 0 é menor que o reembolso solicitado de 5."
        m1.compra(1,2); // Solicita 1 latinha e 2 salgadinhos mas não há crédito na máquina. Logo, o programa imprime "Saldo insuficiente. Valor da compra:7. Crédito atual:0."
        m1.credito(10); // Insere 10 unidades de dinheiro de crédito.
        m1.acessaCredito(); // Imprime "Crédito atual: 10."
        m1.compra(1,2); //Compra efetivada. Imprime "Compra efetivada. Por favor, recolha os itens da gaveta. Obrigado."
        m1.acessaCredito(); // Imprime "Crédito atual: 3."
        m1.compra(4,0); // Solicita 4 latinhas e nenhum salgadinho mas não há crédito na máquina. Logo, o programa imprime "Saldo insuficiente. Valor da compra:12. Crédito atual:3."
        m1.solicitaReembolso(3); // Imprime "Efetuado o eeembolso de 3 unidades de dinheiro."
        m1.acessaItens(); // Imprime "9 latas e 13 salgadinhos disponíveis na máquina."
        m1.getLucro();// O lucro total da máquina neste ponto é de 7 unidades de dinheiro.
    }
}

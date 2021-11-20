/**
 * MaquinaDeVendas
 * Assim como dito no enunciado, as classes estão imprimindo as respostas para o usuario,
 * mas nao retornando algum valor.
 * 
 */
public class MaquinaDeVendas {

    private int numero_latinhas;
    private int numero_salgadinhos;
    private int credito;
    private int lucro;
    private static final int preco_latinhas = 3;
    private static final int preco_salgadinhos = 2;

    /**
     * Construtor da MaquinaDeVendas que fixa o lucro como valor inicial de zero 
     * e o credito inicial como 0. Recebe o numero de latinhas e salgadinhos que 
     * a maquina deve iniciar.
     * @param numero_latinhas é o numero de latinhas que a maquina vai ter quando iniciar
     * @param numero_salgadinhos é o numero de salgadinhos que a maquina vai ter quando iniciar
     */
    public MaquinaDeVendas(int numero_latinhas, int numero_salgadinhos){
        this.numero_latinhas = numero_latinhas;
        this.numero_salgadinhos = numero_salgadinhos;
        lucro = 0;
        credito = 0;
    }

    /**
     * Imprime na tela do usuario quantas latinhas e quantos salgadinhos estão
     * disponíveis na maquina
     */
    public void acessaItens(){
        System.out.printf("%d latas e %d salgadinhos disponíveis na máquina.\n",numero_latinhas,numero_salgadinhos);
        return ;
    }

    /**
     * Retorna ao usuario o valor do credito que está na maquina
     * imprimindo na tela uma mensagem
     */
    public void acessaCredito(){
        System.out.printf("Crédito atual: %d\n",credito);
        return ;
    }

    /**
     * Metodo que realiza o reembolso de creditos disponíveis na maquina
     * @param credito_reembolso valor a ser reembolsado ao usuario
     */
    public void solicitaReembolso(int credito_reembolso){
        if(credito - credito_reembolso < 0){
            System.out.printf("Crédito atual de %d é menor que o reembolso solicitado de %d.\n",credito,credito_reembolso);
        }
        else{
            System.out.printf("Efetuado o reembolso de %d unidades de dinheiro.\n",credito_reembolso);
        }
        return ;
    }


    /**
     * Metodo que realiza a compra de refrigerantes e salgadinhos na maquina
     * @param quantidade_refrigerante é a quantidade de refrigerantes que serão compradas na maquina
     * @param quantidade_salgadinhos é a quantidade de salgadinhos que serão compradas na maquina
     */
    public void compra(int quantidade_refrigerante, int quantidade_salgadinhos){
        int preco = quantidade_refrigerante*preco_latinhas + quantidade_salgadinhos*preco_salgadinhos;
        if(preco > credito){
            System.out.printf("Saldo insuficiente. Valor da compra:%d. Crédito atual:%d.\n",preco,credito);
        }
        else if(quantidade_refrigerante > numero_latinhas || quantidade_salgadinhos > numero_salgadinhos){
            System.out.printf("Compra inválida:\n O pedido tem %d latinhas e %d salgadinhos\n",quantidade_refrigerante,quantidade_salgadinhos);
            System.out.printf("Porém a maquina so dispoe de %d latinhas e %d salgadinhos\n",numero_latinhas,numero_salgadinhos);
        }
        else{
            System.out.println("Compra efetivada. Por favor, recolha os itens da gaveta. Obrigado.");
            credito = credito - preco;
            lucro = lucro + preco;
            numero_latinhas = numero_latinhas - quantidade_refrigerante;
            numero_salgadinhos = numero_salgadinhos - quantidade_salgadinhos;
        }
    }
    /**
     * Insere creditos na maquina
     * @param credito valor inteiro a ser adicionado aos creditos na maquina.
     */
    public void credito(int credito){
        if(credito < 0){
            System.out.println("Valor negativo inválido!");
            return;
        }
        this.credito = this.credito + credito;
        return ;
    }

    /**
     * Retorna o valor do lucro que a maquina já realizou
     * que é o valor das mercadorias vezes a quantidade vendida.
     */
    public void getLucro(){
        System.out.printf("O lucro é %d unidades de dinheiro.",lucro);
    }
}
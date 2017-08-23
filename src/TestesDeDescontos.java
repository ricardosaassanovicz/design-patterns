public class TestesDeDescontos {

    /**
     * Chain of responsibility
     * @param args
     */
    public static void main(String[] args){

        CalculadorDeDescontos descontos = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(600.0);

        orcamento.adicionaItem(new Item("Coca-cola", 200.0));
        orcamento.adicionaItem(new Item("Quipo", 200.0));

        double descontoFinal = descontos.calcula(orcamento);

        System.out.println(descontoFinal);

    }

}

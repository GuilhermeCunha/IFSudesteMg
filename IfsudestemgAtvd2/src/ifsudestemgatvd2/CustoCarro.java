package ifsudestemgatvd2;

/**
 *
 * @author Guilherme
 */
public class CustoCarro {
    private Double custoCarro;
    private Double custoTotal;
    private final Double valorDistribuidor = 0.28;
    private final Double valorImpostos = 0.45;

    public Double getCustoCarro() {
        return custoCarro;
    }

    public void setCustoCarro(Double custoCarro) {
        this.custoCarro = custoCarro;
        this.custoTotal= this.custoCarro + (this.valorDistribuidor*this.custoCarro) + (this.valorImpostos*this.custoCarro);
    }

    public Double getCustoTotal() {
        return custoTotal;
    }
    
    
    
}

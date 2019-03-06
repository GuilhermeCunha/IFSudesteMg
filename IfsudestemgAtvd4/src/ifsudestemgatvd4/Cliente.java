/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsudestemgatvd4;

/**
 *
 * @author Guilherme
 */
public class Cliente {
    private Double saldoMedio;
    private Double credito;
    
    public double consultaSaldo(){
        if(saldoMedio >=0 && saldoMedio <=200) credito=0.0;
        if(saldoMedio >=201 && saldoMedio <=400) credito=(saldoMedio*0.20);
        if(saldoMedio >=401 && saldoMedio <=600) credito=(saldoMedio*0.30);
        if(saldoMedio >=601) credito=(saldoMedio*0.40);
        return credito;
    }

    public Double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(Double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
}


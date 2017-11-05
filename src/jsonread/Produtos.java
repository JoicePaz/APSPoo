package jsonread;


import java.util.Date;

public class Produtos {
   
    private double cotacaoCompra, cotacaoVenda;
    private String dataHoraCotacao;

    public double getCotacaoCompra() { return cotacaoCompra; }
    public double getCotacaoVenda() { return cotacaoVenda; }
    public String getDataHoraCotacao() { return dataHoraCotacao; }
    
    public void setCotacaoCompra(double cotacaoCompra) { this.cotacaoCompra = cotacaoCompra; }
    public void setCotacaoVenda(double cotacaoVenda) { this.cotacaoVenda = cotacaoVenda; }
    public void setDataHoraCotacao(String dataHoraCotacao) { this.dataHoraCotacao = dataHoraCotacao; }
  
}
package br.com.zupacademy.william.transacao.compra;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CompraResponse {

    private String idCompra;
    private BigDecimal valor;
    private LocalDateTime efetivadaEm;

    public CompraResponse(Compra compra) {
        this.idCompra = compra.getId();
        this.valor = compra.getValor();
        this.efetivadaEm = compra.getEfetivadaEm();
    }

    public String getIdCompra() {
        return idCompra;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}

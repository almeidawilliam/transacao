package br.com.zupacademy.william.transacao.kafka.transacao;

import br.com.zupacademy.william.transacao.kafka.transacao.cartao.Cartao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoDeTransacao {

    private String id;
    private BigDecimal valor;

    private Cartao cartao;

    private LocalDateTime efetivadaEm;

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public String getIdCartao() {
        return cartao.getId();
    }
}

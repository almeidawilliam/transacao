package br.com.zupacademy.william.transacao.compra;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Compra {

    @Id
    private String id;
    private BigDecimal valor;

    private String identificadorCartao;
    private LocalDateTime efetivadaEm;

    public Compra(String id, String identificadorCartao, BigDecimal valor, LocalDateTime efetivadaEm) {
        this.id = id;
        this.identificadorCartao = identificadorCartao;
        this.valor = valor;
        this.efetivadaEm = efetivadaEm;
    }

    /**
     * @deprecated para uso exclusivo do hibernate
     */
    @Deprecated
    public Compra() {
    }

    public String getId() {
        return id;
    }

    public String getIdentificadorCartao() {
        return identificadorCartao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}

package br.com.zupacademy.william.transacao;

import br.com.zupacademy.william.transacao.compra.Compra;
import br.com.zupacademy.william.transacao.compra.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @Autowired
    private CompraRepository compraRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoDeTransacao eventoDeTransacao) {

        Compra novaCompra =
                new Compra(eventoDeTransacao.getId(),
                        eventoDeTransacao.getIdCartao(),
                        eventoDeTransacao.getValor(),
                        eventoDeTransacao.getEfetivadaEm());

        compraRepository.save(novaCompra);
    }
}

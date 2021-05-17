package br.com.zupacademy.william.transacao.compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraRepository compraRepository;

    @GetMapping("/{identificadorCartao}")
    public ResponseEntity listarUltimasDez(@PathVariable String identificadorCartao) {

        List<Compra> compras = compraRepository.findTop10ByIdentificadorCartaoOrderByEfetivadaEmDesc(identificadorCartao);

        if (compras.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        List<CompraResponse> comprasResponse = compras.stream()
                .map(CompraResponse::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok(comprasResponse);
    }
}

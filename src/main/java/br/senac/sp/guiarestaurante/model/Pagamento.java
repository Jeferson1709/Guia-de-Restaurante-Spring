package br.senac.sp.guiarestaurante.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valor;
    private Date dataHora;
    private MetodoPagamento pagamento;
    @ManyToOne
    private Pedido pedido;
}

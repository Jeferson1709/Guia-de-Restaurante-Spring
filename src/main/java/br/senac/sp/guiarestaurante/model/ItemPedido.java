package br.senac.sp.guiarestaurante.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private Produto produto;
    private Integer quantidade;
    private Double precoUnit;


}

package br.senac.sp.guiarestaurante.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ManyToAny;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Pedido {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private Date dataHora;
   @ManyToOne
   private Mesa mesa;
   private StatusPedido status;
   @ManyToOne
   private Funcionario funcionario;
   private Double valorTotal;
   @OneToMany(mappedBy = "pedido")
   private List<ItemPedido> itens;
}

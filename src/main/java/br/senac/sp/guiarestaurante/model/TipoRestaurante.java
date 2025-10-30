package br.senac.sp.guiarestaurante.model;

import lombok.Data;

@Data
public class TipoRestaurante {
//    private Integer id;
    private Long id;
    private String nome;
    private String descricao;
    private String palavraChave;
}

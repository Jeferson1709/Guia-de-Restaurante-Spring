package br.senac.sp.guiarestaurante.config;

import lombok.Data;

@Data
public class DbProperties {
private String url; 
private String username; 
private String password;
private String driverClasss; 

}

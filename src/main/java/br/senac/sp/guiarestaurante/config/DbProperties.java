package br.senac.sp.guiarestaurante.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "app.datasource")
public class DbProperties {
    private String url;
    private String username;
    private String password;
    private String driverClassName;

}

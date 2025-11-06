package br.senac.sp.guiarestaurante.config;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;
@Configuration
@EnableConfigurationProperties(DbProperties.class)
public class DbConfig { // arquivo de propriedades
    private final DbProperties PROPS;
    public DbConfig(DbProperties PROPS) {
        this.PROPS = PROPS;
    }
    @Bean // gerenciado pelo spring container (o spring vai gerar/"dar new" objeto)
    public DataSource dataSource() {
        return DataSourceBuilder.create() // DataSourceBuilder db = DataSourceBuilder...
                .driverClassName(PROPS.getDriverClassName())
                .url(PROPS.getUrl()) // retorna localhost...
                .password(PROPS.getPassword()) // retorna uma senha
                .username(PROPS.getUsername()) // retorna um username
                .build(); // constroi o datasource (fonte de dados que gerencia conexões - é diferente de um BD)
    }
}


package word.repositories;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;
import word.entity.Adjective;

public interface AdjectiveRepository extends ReactiveCrudRepository<Adjective, Long> {
    @Query("SELECT * FROM adjective ORDER BY random() LIMIT 1")
    Mono<Adjective> findRandom();
}

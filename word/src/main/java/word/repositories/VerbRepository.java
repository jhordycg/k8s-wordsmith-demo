package word.repositories;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;
import word.entity.Verb;

public interface VerbRepository extends ReactiveCrudRepository<Verb, Long> {
    @Query("SELECT * FROM verb ORDER BY random() LIMIT 1")
    Mono<Verb> findRandom();
}

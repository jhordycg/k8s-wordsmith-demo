package word.repositories;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import word.entity.Noun;

@Repository
public interface NounRepository extends ReactiveCrudRepository<Noun, Long> {
    @Query("SELECT * FROM noun ORDER BY random() LIMIT 1")
    Mono<Noun> findRandom();
}

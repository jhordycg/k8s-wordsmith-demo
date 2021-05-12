package word;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import word.entity.Adjective;
import word.entity.Noun;
import word.entity.Verb;
import word.repositories.AdjectiveRepository;
import word.repositories.NounRepository;
import word.repositories.VerbRepository;

@RestController
public class WordController {
    private final NounRepository nounRepository;
    private final AdjectiveRepository adjectiveRepository;
    private final VerbRepository verbRepository;

    public WordController(NounRepository nounRepository, AdjectiveRepository adjectiveRepository, VerbRepository verbRepository) {
        this.nounRepository = nounRepository;
        this.adjectiveRepository = adjectiveRepository;
        this.verbRepository = verbRepository;
    }

    @GetMapping("/adjective")
    public Mono<Adjective> adjective() {
        return adjectiveRepository.findRandom();
    }

    @GetMapping("/noun")
    public Mono<Noun> noun() {
        return nounRepository.findRandom();
    }

    @GetMapping("/verb")
    public Mono<Verb> verb() {
        return verbRepository.findRandom();
    }
}

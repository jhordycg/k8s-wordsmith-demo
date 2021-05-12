package word.entity;

import org.springframework.data.annotation.Id;

public class Adjective {
    @Id
    private Long id;
    private String word;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}

import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
public class Narrator {

    private String name;

    private int experience;

    private List<Broadcast> broadcasts;

    private String resume;

    public Narrator(String name, int experience, List<Broadcast> broadcasts) {
        this.name = name;
        this.experience = experience;
        this.broadcasts = broadcasts;
    }

    public Narrator(String name, String resume) {
        this.name = name;
        this.resume = resume;
    }
}


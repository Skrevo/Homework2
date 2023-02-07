import broadcast.Broadcast;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Narrator {

    private String name;

    private int experience;

    private Broadcast broadcasts;

    private String resume;

    public Narrator(String name, int experience, Broadcast broadcasts) {
        this.name = name;
        this.experience = experience;
        this.broadcasts = broadcasts;
    }

    public Narrator(String name, String resume) {
        this.name = name;
        this.resume = resume;
    }
}


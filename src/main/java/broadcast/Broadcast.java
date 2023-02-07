package broadcast;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Broadcast {

    private String nameOfBroadcast;
    
    private final double MAX_DURATION = 480;

    private List<PartOfBroadcast> partOfBroadcasts;

    public Broadcast(String nameOfBroadcast, List<PartOfBroadcast> partOfBroadcasts) {
        this.nameOfBroadcast = nameOfBroadcast;
        this.partOfBroadcasts = partOfBroadcasts;
    }
}

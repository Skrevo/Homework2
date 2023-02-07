package broadcast;

public class Song extends PartOfBroadcast{

    private String nameOfSinger;
    private String nameOfSong;

    public Song(String name, double duration, String nameOfSinger, String nameOfSong) {
        super(name, duration);
        this.nameOfSinger = nameOfSinger;
        this.nameOfSong = nameOfSong;
    }

    @Override
    public String toString() {
        return "Song{" +
                "nameOfSinger='" + nameOfSinger + '\'' +
                ", nameOfSong='" + nameOfSong + '\'' +
                ", duration='" + getDuration() +
                '}';
    }
}

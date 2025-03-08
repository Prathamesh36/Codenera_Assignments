package JAN3.Que5;

public class Songs implements Comparable<Songs>{
    private String song_name;
    private int song_duration;

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public int getSong_duration() {
        return song_duration;
    }

    public void setSong_duration(int song_duration) {
        this.song_duration = song_duration;
    }

    public Songs(String song_name, int song_duration) {
        this.song_name = song_name;
        this.song_duration = song_duration;
    }

    @Override
    public String toString() {
        return "\n{" +
                "song_name='" + song_name + '\'' +
                ", song_duration=" + song_duration +
                '}';
    }

    @Override
    public int compareTo(Songs o) {
        return 0;
    }
}

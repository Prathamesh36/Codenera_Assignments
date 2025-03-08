package DEC8.PracticeSession;

class Songs{
    public void songs(){
        System.out.println("Playing Song");
    }
    public void albums(){
        System.out.println("Playing Album");
    }
    public void playlists(){
        System.out.println("Playing PlayList");
    }
}
public class CreateHierarchyForMusicStreaming extends Songs {
    public static void main(String[] args) {
        CreateHierarchyForMusicStreaming ob=new CreateHierarchyForMusicStreaming();
        ob.songs();
        ob.albums();
        ob.playlists();

}
}
package Codeacademy;
import java.util.ArrayList;
public class DesertIslandPlaylist {
}
    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Tiesto");
        desertIslandPlaylist.add("Parios");
        desertIslandPlaylist.add("Sfakianakis");
        desertIslandPlaylist.add("Pakito");
        desertIslandPlaylist.add("DJ Tzeni");
        desertIslandPlaylist.add("DJ !");
        desertIslandPlaylist.add("DJ ?");
        desertIslandPlaylist.add("DJ ::");
        desertIslandPlaylist.add("DJ LKJ");


        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove(7);
        //System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.remove(6);
        desertIslandPlaylist.remove(5);
        // System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.remove(5);
        System.out.println(desertIslandPlaylist);
        String songA=desertIslandPlaylist.get(4);
        String songB =desertIslandPlaylist.get(1);

        desertIslandPlaylist.set(1,songA);
        desertIslandPlaylist.set(4,songB);
        System.out.println(desertIslandPlaylist);
    }

}
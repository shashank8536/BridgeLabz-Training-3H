package WorkShopPractise28Aug;
import java.util.*;

public class MusicPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] songs= {"song1","song2","song3"};

        boolean running = true;
        System.out.println("Welcome to playlist manager");

        while(running){
            System.out.println("\n Choose an option");
            System.out.println("1.Play all Songs");
            System.out.println("2.Play a song By index");
            System.out.println("3.Search a song b name");
            System.out.println("4.exit");

            int choices=sc.nextInt();
            sc.nextLine();

            switch(choices){
                case 1:
                System.out.println("Playing all Songs");
                for(String song:songs){
                    System.out.println("song is "+ song);
                }
                break;

                case 2:
                System.out.println("Enter song index (0 to " + (songs.length - 1) + "): ");
                int index = sc.nextInt();
                sc.nextLine(); // buffer clear
                if (index >= 0 && index < songs.length) {
                    System.out.println(" Now playing: " + songs[index]);
                } else {
                    System.out.println("Invalid index!");
                }
                break;

                case 3:
                System.out.println("Enter song name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (String song : songs) {
                        if (song.equalsIgnoreCase(searchName)) {
                            System.out.println(" Song found!  Playing: " + song);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(" Song not found in playlist!");
                    }
                    break;

                case 4:
                    System.out.println(" Exiting... Thank you for using Music Playlist Manager!");
                    running = false; 
                    break;

                default:
                    System.out.println(" Invalid choice, try again!");
            }

        }
    }
}

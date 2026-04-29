import java.util.*;

public class p31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Add songs
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter song " + i + ": ");
            String song = sc.nextLine();
            playlist.add(song);
        }

        // Display full playlist
        System.out.println("\n--- Full Playlist ---");
        System.out.println(playlist);

        // Play first song
        if (!playlist.isEmpty()) {
            String firstSong = playlist.removeFirst();
            System.out.println("\nPlaying song: " + firstSong);
        } else {
            System.out.println("\nPlaylist is empty.");
        }

        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        // Skip last song
        if (!playlist.isEmpty()) {
            String lastSong = playlist.removeLast();
            System.out.println("\nSkipped song: " + lastSong);
        } else {
            System.out.println("\nNo song to skip.");
        }

        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);

        sc.close();
    }
}
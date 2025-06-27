package tcassignment;

import java.util.Scanner;

interface Playable {
    void play();
    void pause();
    void stop();
}
class MP3Player implements Playable {
    public void play() {
        System.out.println("MP3 Player is playing music...");
    }
    public void pause() {
        System.out.println("MP3 Player is paused.");
    }
    public void stop() {
        System.out.println("MP3 Player is stopped.");
    }
}

class CDPlayer implements Playable {
    public void play() {
        System.out.println("CD Player is playing disc...");
    }
    public void pause() {
        System.out.println("CD Player is paused.");
    }
    public void stop() {
        System.out.println("CD Player is stopped.");
    }
}

class StreamingPlayer implements Playable {
    public void play() {
        System.out.println("Streaming Player is streaming music...");
    }
    public void pause() {
        System.out.println("Streaming Player is paused.");
    }
    public void stop() {
        System.out.println("Streaming Player is stopped.");
    }
}

public class MusicPlayerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Music Player:");
        System.out.println("1. MP3 Player");
        System.out.println("2. CD Player");
        System.out.println("3. Streaming Player");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Playable player;

        switch (choice) {
            case 1: player = new MP3Player(); break;
            case 2: player = new CDPlayer(); break;
            case 3: player = new StreamingPlayer(); break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        while (true) {
            System.out.println("\n1. Play\n2. Pause\n3. Stop\n4. Exit");
            System.out.print("Enter action: ");
            int action = sc.nextInt();

            switch (action) {
                case 1: player.play(); break;
                case 2: player.pause(); break;
                case 3: player.stop(); break;
                case 4: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid action");
            }
        }
    }
}

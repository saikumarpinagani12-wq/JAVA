public class musicplaylistusinglinkedlist {
    static class Node {
        String song;
        Node next;

        Node(String song) {
            this.song = song;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        void addSong(String song) {
            Node newNode = new Node(song);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        void removeSong(String song) {
            if (head == null) return;

            if (head.song.equals(song)) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null && !current.next.song.equals(song)) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            }
        }

        void displayPlaylist() {
            Node current = head;
            while (current != null) {
                System.out.println(current.song);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList playlist = new LinkedList();

        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.addSong("Song C");

        System.out.println("Playlist:");
        playlist.displayPlaylist();

        playlist.removeSong("Song B");
        System.out.println("\nPlaylist after removing Song B:");
        playlist.displayPlaylist();
    }
    
}

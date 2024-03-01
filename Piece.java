public class Piece {
    private String title;
    private String artist;
    private int length;

    public Piece(String title, String artist, int length){
        setTitle(title);
        setArtist(artist);
        setLength(length);
    }

    public void setTitle(String title) {
        if(title.matches("^[a-zA-Z0-9 ]+$")){
            this.title = title;
        } else {
            throw new IllegalArgumentException("Nieprawidłowy tytuł");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setArtist(String artist) {
        if(artist.matches("^[a-zA-Z0-9 ]+$")){
            this.artist = artist;
        } else {
            throw new IllegalArgumentException("Nieprawidłowy autor");
        }
    }

    public String getArtist() {
        return artist;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}

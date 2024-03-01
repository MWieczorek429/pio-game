import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Piece> pieces = new ArrayList();
    private Printer printer = new Printer();

    private int playlistCapacity = 2;

    void addPiece(Piece piece){
        if(totalPieces() < playlistCapacity) {
            if (piece != null) {
                pieces.add(piece);
            } else {
                throw new IllegalArgumentException("Utwór nie może być null!");
            }
        } else {
            throw new IllegalArgumentException("Playlista posiada maksymalna ilosc utworow.");
        }
    }

    void print(){
        setPrinter(printer).print(pieces);
        /*
        int totalTime = 0;

        System.out.print("\nUtwory: ");

        for(Piece piece : pieces){
            System.out.print(piece.getTitle() + ", ");
            totalTime += piece.getLength();
        }

        System.out.println("\nCałkowity czas odtwarzania: " + totalTime);
         */
    }

    void clear(){
        pieces.clear();
    }

    void remove(String artist){
        boolean removed = pieces.removeIf(piece
                -> piece.getArtist().equals(artist));

        if(!removed){
            throw new IllegalArgumentException("Playlista nie posiada utworów tego artysty.");
        }
    }

    public Piece search(String title){
        for(Piece piece : pieces){
            if(piece.getTitle().equals(title)){
                return piece;
            }
        }
        throw new IllegalArgumentException("Playlista nie zawiera takiego utworu.");
    }

    public int totalPieces(){
        return pieces.size();
    }

    private Printer setPrinter(PlaylistPrinter printer){
        return (Printer) printer;
    }
}

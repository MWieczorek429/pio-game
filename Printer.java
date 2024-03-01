import java.util.List;

public class Printer implements PlaylistPrinter{
    public void print(List<Piece> pieceList){
        int totalTime = 0;

        System.out.print("\nUtwory: ");

        for(Piece piece : pieceList){
            System.out.print(piece.getTitle() + ", ");
            totalTime += piece.getLength();
        }

        System.out.println("\nCałkowity czas odtwarzania: " + totalTime);
    }
}

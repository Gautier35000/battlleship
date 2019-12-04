import java.util.HashMap;

public class HidingBoard {

    char tableauLettre[] = {'a','b','c','d','e','f','g','h','i','j'};
    String caseVide="caseVide";
    public HashMap<String, String> map() {
        HashMap<String, String> hiddingBoard = new HashMap<String, String>();
        for (int i = 0; i < tableauLettre.length; i++) {
            for (int j = 0; j <= tableauLettre.length+1; j++) {
                hiddingBoard.put(tableauLettre[i] + String.valueOf(j),caseVide );
            }
        }
        return hiddingBoard;
    }
}
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    private static Object HidingBoard;

    public static void main(String[] args) {
        Ship[] listBateau;
        listBateau=new Ship[ModelBateau.values().length];
        HidingBoard hidingBoard = new HidingBoard();

        int i = 0;
        int j=1;
        ArrayList<String> tableauLettre = new ArrayList<String>();
        tableauLettre.add("a");
        tableauLettre.add("b");
        tableauLettre.add("c");
        tableauLettre.add("d");
        tableauLettre.add("e");
        tableauLettre.add("f");
        tableauLettre.add("g");
        tableauLettre.add("h");
        tableauLettre.add("i");
        tableauLettre.add("j");


        for (ModelBateau model : ModelBateau.values()) {
            System.out.println("Veuillez entrer les coordonnées du bateau "+j);
            Scanner sc = new Scanner(System.in);
            String coordonnee = sc.nextLine();


            while(hidingBoard.map().get(coordonnee)==null){
                System.out.println("Le bateau est en dehors de la carte");
                System.out.println("Veuillez entrer les coordonnées du bateau "+j);
                coordonnee = sc.nextLine();
            }
            while(!hidingBoard.map().get(coordonnee).equals("0")){
                System.out.println("Un bateau est déjà sur la case");
                System.out.println("Veuillez entrer les coordonnées du bateau "+j);
                coordonnee = sc.nextLine();
            }

            System.out.println("Veuillez entrer la direction du bateau "+j);

            Direction direction=getDirection();
            switch (direction){
                case WEST:
                    int longueurBateau=model.getSize();
                    String coordonneeX=coordonnee.substring(0,1);


                    if(tableauLettre.indexOf(coordonneeX)-longueurBateau<0){
                        System.out.println("Le bateau dépasse de la grille");
                    }
            }



            listBateau[i]= new Ship(model.name(), model, direction, new Coordonnee(coordonnee),false);
            i++;
            j++;
        }
        System.out.println(listBateau[1].getModelBateau());
    }

    public static Direction getDirection() {
        Direction direction = null;
        Scanner sc = new Scanner(System.in);
        String strDirection = sc.nextLine();
        for (Direction dir : Direction.values()) {
            if (strDirection.toUpperCase().equals(dir.name())) {
                direction = dir;
            }

        }
        return (direction);
    }


}


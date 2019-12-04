public class Ship {
    private String nameShip;
    private ModelBateau modelBateau;
    private boolean operation;
    private Direction direction;
    private Coordonnee coordonnee;

    public String getNameShip() {
        return nameShip;
    }

    public Ship(String nameShip, ModelBateau modelBateau, Direction direction,Coordonnee coordonnee, boolean operation) {
        this.nameShip = nameShip;
        this.modelBateau = modelBateau;
        this.operation = true ;
        this.direction = direction;
        this.coordonnee=coordonnee;
    }


    public void setNameShip(String nameShip) {
        this.nameShip = nameShip;
    }

    public ModelBateau getModelBateau() {
        return modelBateau;
    }

    public void setModelBateau(ModelBateau modelBateau) {
        this.modelBateau = modelBateau;
    }

    public boolean isOperation() {
        return operation;
    }

    public void setOperation(boolean operation) {
        this.operation = operation;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


}

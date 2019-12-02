public class Ship {
    private String nameShip;
    private String typeShip;
    private boolean operation;
    private Direction direction;

    private Ship(){
    }

    public Ship(String nameShip, String typeShip, boolean operation, Direction direction) {
        this.nameShip = nameShip;
        this.typeShip = typeShip;
        this.operation = operation;
        this.direction = direction;
    }

    public String getNameShip() {
        return nameShip;
    }

    public void setNameShip(String nameShip) {
        this.nameShip = nameShip;
    }

    public String getTypeShip() {
        return typeShip;
    }

    public void setTypeShip(String typeShip) {
        this.typeShip = typeShip;
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

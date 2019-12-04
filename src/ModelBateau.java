public enum ModelBateau {
    porte_avion(5,"Porte-Avions"),
    //croiseur(4,"Croiseur"),
    //contre_torpilleur(3,"Contre-Torpilleur"),
    //sous_marin(3,"Sous-Marin"),
    torpilleur(2,"Torpilleur");
    private int size;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ModelBateau(int size, String name){
        this.size=size;
        this.name=name;
    }
    public final int getSize() {
        return size;

    }

    public void setSize(int size) {
        this.size = size;
    }


}


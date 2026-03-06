package org.example.model;

public class Bedroom extends Room{
    private String name;
    private Bed bed;
    private Wardrobe wardrobe;

    public Bedroom(Carpet carpet, Ceiling ceiling, Lamp lamp,
                   Wall wall1, Wall wall2, Wall wall3, Wall wall4, String name,Bed bed,Wardrobe wardrobe) {
        super(carpet, ceiling, lamp, wall1, wall2, wall3, wall4);
        this.name= name;
        this.bed=bed;
        this.wardrobe=wardrobe;
    }
    public void createBedroom(){
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        bed.make();
        getCarpet();
        wardrobe.add();
        getLamp().turnOn();


    }

    public Bed getBed() {
        return bed;
    }

    public String getName() {
        return name;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "bed=" + bed +
                ", name='" + name + '\'' +
                ", wardrobe=" + wardrobe +
                ", room= " + super.toString()+
                '}';
    }
}

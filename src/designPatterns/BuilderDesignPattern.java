package designPatterns;

// Product class
class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    // Displaying the house components
    public void show() {
        System.out.println("House: " + foundation + ", " + structure + ", " + roof + ", " + interior);
    }
}

// Abstract builder
abstract class HouseBuilder {
    protected House house;

    public House getHouse() {
        return house;
    }

    public void createNewHouse() {
        house = new House();
    }

    public abstract void buildFoundation();
    public abstract void buildStructure();
    public abstract void buildRoof();
    public abstract void buildInterior();
}

// Concrete builder
class ConcreteHouseBuilder extends HouseBuilder {
    public void buildFoundation() {
        house.setFoundation("Concrete");
    }

    public void buildStructure() {
        house.setStructure("Concrete Walls");
    }

    public void buildRoof() {
        house.setRoof("Concrete Roof");
    }

    public void buildInterior() {
        house.setInterior("Concrete Flooring");
    }
}

// Director
class CivilEngineer {
    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        return houseBuilder.getHouse();
    }

    public void constructHouse() {
        houseBuilder.createNewHouse();
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }
}

// Main class
public class BuilderDesignPattern {
    public static void main(String[] args) {
        // Create a concrete house builder
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();

        // Create a civil engineer with the concrete house builder
        CivilEngineer civilEngineer = new CivilEngineer(concreteHouseBuilder);

        // Construct the house
        civilEngineer.constructHouse();

        // Get the constructed house
        House house = civilEngineer.getHouse();

        // Display the house components
        house.show();
    }
}

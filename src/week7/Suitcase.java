package week7;
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int weightLimit;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList<>();
    }

    public void addThing(Thing thing){
        int weightCurrent = 0;
        for (Thing currentThing :this.things) {
            weightCurrent += currentThing.getWeight();
        }
        if(weightCurrent + thing.getWeight() <= this.weightLimit) {
            this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        int weightCurrent = 0;

        for (Thing currentThing :this.things) {
            weightCurrent += currentThing.getWeight();
        }

        String langControl;

        if (this.things.size() == 0) {
            langControl = "empty";
        } else if (this.things.size() == 1) {
            langControl = "thing";
        } else {
            langControl = "things";
        }

        return this.things.size() + " " + langControl + " (" + weightCurrent + " kg)";
    }

    public void printThings(){
        for (Thing thing :this.things) {
            System.out.println(thing);
        }
    }

    public int totalWeight(){
        int weightCurrent = 0;
        for (Thing currentThing :this.things) {
            weightCurrent += currentThing.getWeight();
        }
        return weightCurrent;
    }

    public Thing heaviestThing(){
        Thing heavist = new Thing("", 0);
        for (Thing thing : this.things) {
            if (thing.getWeight() > heavist.getWeight()){
                heavist = thing;
            }
        }
        if(this.things.size() == 0) return null;
        return heavist;
    }
}

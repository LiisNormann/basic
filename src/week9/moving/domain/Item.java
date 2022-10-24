package week9.moving.domain;

public class Item implements Thing, Comparable<Item> {
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getItemVolume() {
        return volume;
    }

    @Override
    public int getVolume() {
        return this.getItemVolume();
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }

    @Override
    public int compareTo(Item anotherItem) {
        return Integer.compare(this.getVolume(), anotherItem.getVolume());
    }
}

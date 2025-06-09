package Skier;

import hla.rti1516e.ObjectInstanceHandle;

public class Skier {
    int id;
    int slideTime;
    ObjectInstanceHandle skierHandle;

    @Override
    public String toString() {
        return "Skier{" +
                "id=" + id +
                ", slideTime=" + slideTime +
                ", skierHandle=" + skierHandle +
                '}';
    }

    public Skier(int id, int slideTime, ObjectInstanceHandle skierHandle) {
        this.slideTime = slideTime;
        this.id = id;
        this.skierHandle = skierHandle;
    }

    public int getId() {
        return id;
    }

    public int getSlideTime() {
        return slideTime;
    }

    public ObjectInstanceHandle getSkierHandle() {
        return skierHandle;
    }
}

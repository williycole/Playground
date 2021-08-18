package Collections.Sets;/*
    Only add/edit code where it is stated in the description.
*/

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Key key;


    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes type) {
        this.orbitalPeriod = orbitalPeriod;
        key = new Key(name, type);
        this.satellites = new HashSet<>();
    }


    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return satellites.add(moon);
    }

    public Key getKey() {
        return key;
    }

    public static Key makeKey(String name, BodyTypes type) {
        return new Key(name, type);
    }


    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody tempObj = (HeavenlyBody) obj;
            return key.equals((tempObj.getKey()));
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return key.hashCode();
    }

    @Override
    public String toString() {
        return key.getName() + ": " + key.getBodyType().toString() + ", " + orbitalPeriod;
    }

    public enum BodyTypes {
        PLANET,
        DWARF_PLANET,
        MOON
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes type) {
            this.name = name;
            bodyType = type;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null) {
                return false;
            }

            String name = ((Key) obj).getName();
            BodyTypes type = ((Key) obj).getBodyType();

            return (getName().equals(name)) && (getBodyType() == (type));
        }

        @Override
        public int hashCode() {
            return name.hashCode() + bodyType.hashCode() + 31;
        }

        @Override
        public String toString() {
            return name + ": " + bodyType.toString();
        }
    }
}
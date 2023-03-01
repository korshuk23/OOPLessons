package oop.practice.classes.airline;

public enum AircraftType {
    DIRECT_SCHEDULED_FLIGHT("Direct scheduled flight"),
    DIRECT_NON_SCHEDULED_FLIGHT("Direct non scheduled flight"),
    CHARTER_FLIGHT("Charter flight"),
    TRANSIT_FLIGHT("Transit flight"),
    CONNECTING_FLIGHT("Connecting flight");
    private final String type;

    AircraftType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}

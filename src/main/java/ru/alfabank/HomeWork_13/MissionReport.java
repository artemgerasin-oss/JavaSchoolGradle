package ru.alfabank.HomeWork_13;

// MissionReport.java
import java.util.List;
import java.util.Objects;

public class MissionReport {
    private String missionName;
    private List<Alien> capturedAliens;
    private int squadSize;

    public MissionReport(String missionName, List<Alien> capturedAliens, int squadSize) {
        this.missionName = missionName;
        this.capturedAliens = capturedAliens;
        this.squadSize = squadSize;
    }

    public String getMissionName() {
        return missionName;
    }

    public List<Alien> getCapturedAliens() {
        return capturedAliens;
    }

    public int getSquadSize() {
        return squadSize;
    }

    @Override
    public String toString() {
        return "Mission: " + missionName + "\n" +
                "Cach by alients " + (capturedAliens == null ? 0 : capturedAliens.size()) + "\n" +
                "Squad size: " + squadSize + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MissionReport)) return false;
        MissionReport that = (MissionReport) o;
        return squadSize == that.squadSize &&
                Objects.equals(missionName, that.missionName) &&
                Objects.equals(capturedAliens, that.capturedAliens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(missionName, capturedAliens, squadSize);
    }
}

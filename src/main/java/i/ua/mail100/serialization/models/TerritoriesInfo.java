package i.ua.mail100.serialization.models;

public class TerritoriesInfo {

    private String info;

    public TerritoriesInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "TerritoriesInfo{" +
                "info='" + info + '\'' +
                '}';
    }
}
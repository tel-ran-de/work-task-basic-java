package java_2.practice.game.hero;

public class Elf {
    int id;
    boolean isLive;
    String name;
    String group;
    double scope;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getScope() {
        return scope;
    }

    public void setScope(double scope) {
        this.scope = scope;
    }
}

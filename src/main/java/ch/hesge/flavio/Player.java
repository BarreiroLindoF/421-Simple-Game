package ch.hesge.flavio;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public boolean play(Tumbler tumbler) {
        tumbler.shakeTumbler();
        return Rules.victory(tumbler);
    }

    public String getName() {
        return name;
    }

}

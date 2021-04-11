public class murderEnvelope {
    private static Card person;
    private static Card weapon;
    private static Card room;

    murderEnvelope() {
    }

    public static Card getPerson() {
        return person;
    }

    public void setPerson(Card u) {
        person = u;
    }

    public static Card getWeapon() {
        return weapon;
    }

    public void setWeapon(Card u) {
        weapon = u;
    }

    public static Card getRoom() {
        return room;
    }

    public void setRoom(Card u) {
        room = u;
    }
}
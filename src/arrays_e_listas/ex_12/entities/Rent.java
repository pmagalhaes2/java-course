package arrays_e_listas.ex_12.entities;

public class Rent {
    private String name;
    private String email;
    private int room;

    public Rent(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRoom() {
        return room;
    }
}

package data;
public class Client{
    private String name;
    private String surname;
    private String card;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCard() {
        return card;
    }
}


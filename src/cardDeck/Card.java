package cardDeck;

class Card {
    private String type;
    private int number;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPriorityNumbers() {
        return number;
    }

    public void setPriorityNumbers(int number) {
        this.number = number;
    }
}

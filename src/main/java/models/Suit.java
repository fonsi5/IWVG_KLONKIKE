package models;

public enum Suit {
    OROS('O'), COPAS('C'), ESPADAS('E'), BASTOS('B');

    private char value;

    private Suit(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

}
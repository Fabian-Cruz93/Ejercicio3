class Card {
    private Palo palo;
    private Color color;
    private Valor valor;

    public Card(Palo palo, Color color, Valor valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return palo + ", " + color + ", " + valor;
    }
}

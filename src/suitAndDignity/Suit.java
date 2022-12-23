package suitAndDignity;

public enum Suit
{
    SPADES ("♠"),
    CLUBS ("♣"),
    HEARTS ("♥"),
    DIAMONDS("♦");

    private final String title;

    Suit(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    @Override
    public String toString()
    {
        return title;
    }
}

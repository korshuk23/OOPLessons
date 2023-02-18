package oop.practice.clases.henfactory;

public class HenFactory {
    public Hen breed(Country country) {
        if (Country.BELARUS.equals(country)) return new BelarusHen();
        if (Country.MOLDOVA.equals(country)) return new MoldovanHen();
        if (Country.RUSSIA.equals(country)) return new RussianHen();
        if (Country.UKRAINE.equals(country)) return new UkranianHen();
        return null;
    }
}

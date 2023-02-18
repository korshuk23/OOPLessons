package oop.practice.clases.henfactory;

public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 56;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "моя страна: " + Country.RUSSIA + " я несу " + getCountOfEggsPerMonth() + "яиц в день";
    }
}

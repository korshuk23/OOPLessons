package oop.practice.classes.henfactory;

public class BelarusHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 56;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ". Моя страна: " + Country.BELARUS + " я несу " + getCountOfEggsPerMonth() + " яиц в день";
    }
}

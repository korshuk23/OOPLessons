package oop.practice.clases.henfactory;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 45;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "моя страна: " + Country.MOLDOVA + " я несу " + getCountOfEggsPerMonth() + "яиц в день";
    }
}

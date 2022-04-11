public class Baby {
    private boolean isHungry;

    public void setIsHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void eat(String foodDesc) throws NotHungryException {
        if (!isHungry) throw new NotHungryException(String.format("rejects %s", foodDesc));
        System.out.printf("eating %s\n", foodDesc);
    }
}

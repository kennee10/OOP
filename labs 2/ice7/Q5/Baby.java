public class Baby {
    private boolean isHungry;

    public void setIsHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public void eat(String foodDesc) throws NotHungryException{
        if (isHungry) {
            System.out.println("eating " + foodDesc);
        } else {
            throw new NotHungryException("rejects" + foodDesc);
        }
    }
}

public class OneBlueHeron {
    private static OneBlueHeron single_instance = null;

    private boolean leftLeg;

    private OneBlueHeron() {
        this.leftLeg = true;
    }

    public static OneBlueHeron getInstance() {
        if (single_instance == null)
            single_instance = new OneBlueHeron();

        return single_instance;
    }

    public void switchStance() {
        this.leftLeg = !this.leftLeg;
        if (leftLeg) {
            System.out.println("left leg");
        } else {
            System.out.println("right leg");
        }
    }
}

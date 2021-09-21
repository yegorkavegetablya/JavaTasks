package task19;

public class Bed extends Furniture {
    public Bed(String name, String material, String style) {
        super(name, material, style);
    }

    @Override
    public void getBuilt() {
        super.getBuilt();

        System.out.println("Bed named " + this.getName() + " made of " + this.getMaterial() + " in " + this.getStyle()
                + " style has just been built, now you can sleep on it!\n");
    }

    @Override
    public void getUsed() {
        super.getUsed();

        if (this.isUsed()) {
            System.out.println("Now you are sleeping in bed named " + this.getName() + " made of " + this.getMaterial()
                    + " in " + this.getStyle() + " style.\n");
        }
    }

    @Override
    public void getUnused() {
        super.getUnused();

        System.out.println("Now you are no longer sleeping in bed named " + this.getName() + " made of " +
                this.getMaterial() + " in " + this.getStyle() + " style.\n");
    }

    @Override
    public int getPrice() {
        return 3000;
    }
}

package task19;

public class Chair extends Furniture {
    public Chair(String name, String material, String style) {
        super(name, material, style);
    }

    @Override
    public void getBuilt() {
        super.getBuilt();

        System.out.println("Chair named " + this.getName() + " made of " + this.getMaterial() + " in " + this.getStyle()
                + " style has just been built, now you can sit on it!\n");
    }

    @Override
    public void getUsed() {
        super.getUsed();

        if (this.isUsed()) {
            System.out.println("Now you are sitting on chair named " + this.getName() + " made of " + this.getMaterial()
                    + " in " + this.getStyle() + " style.\n");
        }
    }

    @Override
    public void getUnused() {
        super.getUnused();

        System.out.println("Now you are no longer sitting on chair named " + this.getName() + " made of " +
                this.getMaterial() + " in " + this.getStyle() + " style.\n");
    }

    @Override
    public int getPrice() {
        return 500;
    }
}

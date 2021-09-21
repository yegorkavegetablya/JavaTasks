package task19;

public class Wardrobe extends Furniture {
    public Wardrobe(String name, String material, String style) {
        super(name, material, style);
    }

    @Override
    public void getBuilt() {
        super.getBuilt();

        System.out.println("Wardrobe named " + this.getName() + " made of " + this.getMaterial() + " in " + this.getStyle()
                + " style has just been built, now you can keep your clothes in it!\n");
    }

    @Override
    public void getUsed() {
        super.getUsed();

        if (this.isUsed()) {
            System.out.println("Now you are keeping your clothes in wardrobe named " + this.getName() + " made of "
                    + this.getMaterial() + " in " + this.getStyle() + " style.\n");
        }
    }

    @Override
    public void getUnused() {
        super.getUnused();

        System.out.println("Now you are no longer keeping your clothes in wardrobe named " + this.getName()
                + " made of " + this.getMaterial() + " in " + this.getStyle() + " style.\n");
    }

    @Override
    public int getPrice() {
        return 5000;
    }
}

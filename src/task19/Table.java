package task19;

public class Table extends Furniture {
    public Table(String name, String material, String style) {
        super(name, material, style);
    }

    @Override
    public void getBuilt() {
        super.getBuilt();

        System.out.println("Table named " + this.getName() + " made of " + this.getMaterial() + " in " + this.getStyle()
                + " style has just been built, now you can work on it!\n");
    }

    @Override
    public void getUsed() {
        super.getUsed();

        if (this.isUsed()) {
            System.out.println("Now you are working on table named " + this.getName() + " made of " + this.getMaterial()
                    + " in " + this.getStyle() + " style.\n");
        }
    }

    @Override
    public void getUnused() {
        super.getUnused();

        System.out.println("Now you are no longer working on table named " + this.getName() + " made of " +
                this.getMaterial() + " in " + this.getStyle() + " style.\n");
    }

    @Override
    public int getPrice() {
        return 2500;
    }
}

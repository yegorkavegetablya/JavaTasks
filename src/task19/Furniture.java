package task19;

import task20.Pricable;

public class Furniture implements Pricable {
    private String name;
    private String material;
    private String style;
    private boolean isBuilt;
    private boolean isUsed;

    public Furniture(String name, String material, String style) {
        this.name = name;
        this.material = material;
        this.style = style;
        isBuilt = false;
        isUsed = false;
    }

    public String getName() {
        return name;
    }
    public String getMaterial() {
        return material;
    }
    public String getStyle() {
        return style;
    }
    public boolean isUsed() {
        return isUsed;
    }

    public void getBuilt() {
        isBuilt = true;
    }

    public void getUsed() {
        if (this.isBuilt) {
            this.isUsed = true;
        }
    }
    public  void getUnused() {
        this.isUsed = false;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

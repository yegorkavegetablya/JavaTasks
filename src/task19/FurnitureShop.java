package task19;

import java.lang.reflect.Type;
import java.util.Map;

public class FurnitureShop {
    private static int money;
    private static int soldFurnitureAmount;

    private static final int buildingBedPrice = 100;
    private static final int buildingChairPrice = 20;
    private static final int buildingTablePrice = 80;
    private static final int buildingWardrobePrice = 130;

    public static int getMoney() {
        return money;
    }
    public static int getSoldFurnitureAmount() {
        return soldFurnitureAmount;
    }

    public static Furniture sellFurniture(String type, String name, String material, String style) {
        Furniture result = null;

        switch (type) {
            case "Bed":
                result = new Bed(name, material, style);
                money += ((Bed)result).getPrice();
                break;
            case "Chair":
                result = new Chair(name, material, style);
                money += ((Chair)result).getPrice();
                break;
            case "Table":
                result = new Table(name, material, style);
                money += ((Table)result).getPrice();
                break;
            case "Wardrobe":
                result = new Wardrobe(name, material, style);
                money += ((Wardrobe)result).getPrice();
                break;
        }

        return result;
    }

    public static void buildFurniture(Furniture furniture) {
        furniture.getBuilt();

        soldFurnitureAmount += 1;
        switch (furniture.getClass().getName()) {
            case "Bed":
                money += buildingBedPrice;
                break;
            case "Chair":
                money += buildingChairPrice;
                break;
            case "Table":
                money += buildingTablePrice;
                break;
            case "Wardrobe":
                money += buildingWardrobePrice;
                break;
        }
    }
}

package task19;

public class Executer19 {
    public static void test() {
        Bed bed = (Bed)FurnitureShop.sellFurniture("Bed", "BedUltra3000", "metal", "hi-tech");
        Chair chair = (Chair)FurnitureShop.sellFurniture("Chair", "ImGonnaBreakSomeday", "wood", "barokko");
        Table table = (Table)FurnitureShop.sellFurniture("Table", "JustTable", "plastic", "classic");
        Wardrobe wardrobe = (Wardrobe)FurnitureShop.sellFurniture("Wardrobe", "TARDIS", "unknown", "unreal");

        FurnitureShop.buildFurniture(bed);
        FurnitureShop.buildFurniture(chair);
        FurnitureShop.buildFurniture(table);
        FurnitureShop.buildFurniture(wardrobe);

        bed.getUsed();
        chair.getUsed();
        table.getUsed();
        wardrobe.getUsed();

        bed.getUnused();
        chair.getUnused();
        table.getUnused();
        wardrobe.getUnused();

        System.out.println("Furniture sold: " + FurnitureShop.getSoldFurnitureAmount() + '\n');
        System.out.println("Money earned: " + FurnitureShop.getMoney() + '\n');
    }
}

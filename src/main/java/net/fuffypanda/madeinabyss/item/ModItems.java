package net.fuffypanda.madeinabyss.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fuffypanda.madeinabyss.MadeInAbyss;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item WHITE_WHISTLE = registerItem("white_whistle",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MadeInAbyss.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MadeInAbyss.LOGGER.info("Registering Mod Items for " + MadeInAbyss.MOD_ID);
    }

}

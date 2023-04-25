package net.fuffypanda.madeinabyss;

import net.fuffypanda.madeinabyss.MadeInAbyss;
import net.fuffypanda.madeinabyss.structures.InvertedTreeOne;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.structure.StructureType;

public class ModStructures {

    public static StructureType<InvertedTreeOne> INVERTED_TREE_ONE;

    public static void registerStructureFeatures() {
        INVERTED_TREE_ONE = Registry.register(Registry.STRUCTURE_TYPE, new Identifier(MadeInAbyss.MOD_ID, "inverted_tree_one"), () -> InvertedTreeOne.CODEC);
    }
}

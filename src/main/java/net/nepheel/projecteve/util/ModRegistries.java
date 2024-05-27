package net.nepheel.projecteve.util;

import net.nepheel.projecteve.ProjectEveMod;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModRegistries {
    public static void registerModStuffs() {
        createPortal();
    }

    private static void createPortal() {
        CustomPortalBuilder.beginPortal()
                .flatPortal()
                .onlyLightInOverworld()
                .frameBlock(Blocks.DARK_PRISMARINE)
                .lightWithItem(Items.PRISMARINE_SHARD)
                .destDimID(new Identifier(ProjectEveMod.MOD_ID, "evedim"))
                .tintColor(0xc76efa)
                .registerPortal();
    }

}
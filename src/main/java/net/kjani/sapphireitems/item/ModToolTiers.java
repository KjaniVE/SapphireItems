package net.kjani.sapphireitems.item;

import net.kjani.sapphireitems.SapphireItems;
import net.kjani.sapphireitems.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    // New sapphire tier
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(7, 5000, 20.0F, 7.0F, 25,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(SapphireItems.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());
}

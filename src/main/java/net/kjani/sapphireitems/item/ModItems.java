package net.kjani.sapphireitems.item;

import net.kjani.sapphireitems.SapphireItems;
import net.kjani.sapphireitems.item.custom.ModArmorItem;
import net.kjani.sapphireitems.item.custom.PaxelItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SapphireItems.MOD_ID);

    //Items/Ingredients
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    //Tools
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 7, 1, new Item.Properties().fireResistant().rarity(ModRarity.LEGENDARY)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, -3, 2, new Item.Properties().fireResistant().rarity(ModRarity.LEGENDARY)));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 9, 2, new Item.Properties().fireResistant().rarity(ModRarity.LEGENDARY)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0, 2, new Item.Properties().fireResistant().rarity(ModRarity.LEGENDARY)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, -15, 0, new Item.Properties().fireResistant().rarity(ModRarity.LEGENDARY)));
    public static final RegistryObject<Item> SAPPHIRE_PAXEL = ITEMS.register("sapphire_paxel",
            () -> new PaxelItem(ModToolTiers.SAPPHIRE, 3, 2, new Item.Properties().fireResistant().rarity(ModRarity.LEGENDARY)));

    //Shields
    public static final RegistryObject<Item> SAPPHIRE_SHIELD = ITEMS.register("sapphire_shield",
            () -> new ShieldItem(new Item.Properties().fireResistant().rarity(ModRarity.LEGENDARY).durability(150000)));


    //Armor
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().rarity(ModRarity.LEGENDARY)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().rarity(ModRarity.LEGENDARY)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().rarity(ModRarity.LEGENDARY)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().rarity(ModRarity.LEGENDARY)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package net.kjani.sapphireitems.item;

import net.kjani.sapphireitems.SapphireItems;
import net.kjani.sapphireitems.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

// suppresses unused warnings (even tough it is used)
@SuppressWarnings("unused")
public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SapphireItems.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SAPPHIRE_TAB = CREATIVE_MODE_TABS.register("sapphire_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.sapphire_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Items/ingredients
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                        //Blocks
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());

                        //Ores
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

                        //Tools
                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(ModItems.SAPPHIRE_HOE.get());
                        pOutput.accept(ModItems.SAPPHIRE_PAXEL.get());

                        //Armor
                        pOutput.accept(ModItems.SAPPHIRE_HELMET.get());
                        pOutput.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(ModItems.SAPPHIRE_BOOTS.get());

                        //Shields
                        pOutput.accept(ModItems.SAPPHIRE_SHIELD.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
package tutorial.xfeuerfalkex.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import tutorial.xfeuerfalkex.Tutorialmod;
import tutorial.xfeuerfalkex.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup EPIC_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Tutorialmod.MOD_ID, "epic_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.EPIC_SWORD))
                    .displayName(Text.translatable("itemgroup.tutorialmod.epic_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.EPIC_SWORD);
                        entries.add(ModItems.EPIC_SWORD_FIRE);

                    }).build());

    public static final ItemGroup EPIC_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Tutorialmod.MOD_ID, "epic_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.FLAMING_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.epic_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FLAMING_BLOCK);
                        entries.add(ModBlocks.BLUE_FLAMING_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        Tutorialmod.LOGGER.info("Registering Item Groups for " + Tutorialmod.MOD_ID);
    }
}

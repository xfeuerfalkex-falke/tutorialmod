package tutorial.xfeuerfalkex.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tutorial.xfeuerfalkex.Tutorialmod;
import tutorial.xfeuerfalkex.item.custom.ChiselItem;

public class ModItems {
    public static final Item EPIC_SWORD = registerItem("epic_sword",
            new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,3,-2F)))
    );
    public static final Item EPIC_SWORD_FIRE = registerItem("epic_sword_fire",
            new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,6,-1.8F)))
    );
    public static final Item FIRESTONE = registerItem("firestone", new Item(new Item.Settings()));
    public static final Item BLUE_FIRESTONE = registerItem("blue_firestone", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Tutorialmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Tutorialmod.LOGGER.info("Registering Mod Items for " + Tutorialmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(EPIC_SWORD);
            entries.add(EPIC_SWORD_FIRE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FIRESTONE);
            entries.add(BLUE_FIRESTONE);
        });

    }
}

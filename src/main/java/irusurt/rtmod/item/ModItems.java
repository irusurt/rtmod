package irusurt.rtmod.item;

import irusurt.rtmod.RTMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
  public static final Item SNAIL_SHELL = registerItem("snail_shell", new Item(new Item.Settings()));

  private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(RTMod.MOD_ID, name), item); 
  }

  public static void registerModItems() {
    RTMod.LOGGER.info("Registering mod items for " + RTMod.MOD_ID);

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
      entries.add(SNAIL_SHELL);
    });
  }
}

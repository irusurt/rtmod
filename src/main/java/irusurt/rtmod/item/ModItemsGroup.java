package irusurt.rtmod.item;

import irusurt.rtmod.RTMod;
import irusurt.rtmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {
  public static final ItemGroup RTMOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
    Identifier.of(RTMod.MOD_ID, "rtmod_items"),
    FabricItemGroup.builder()
      .icon(() -> new ItemStack(ModItems.SNAIL_SHELL))
      .displayName(Text.translatable("itemgroup.rtmod.rtmod_items"))
      .entries((displayContext, entries) -> {
        entries.add(ModItems.SNAIL_SHELL);
        entries.add(ModBlocks.FOSSIL_BLOCK);
        entries.add(ModItems.FOSSIL_SHARD);
        entries.add(ModBlocks.RECONSTRUCTED_FOSSIL_BLOCK);
      }).build());

  public static void registerItemGroups() {
    RTMod.LOGGER.info("Registering Items Group for " + RTMod.MOD_ID);
  }
}

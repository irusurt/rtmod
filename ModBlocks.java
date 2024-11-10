package irusurt.rtmod.block;

import irusurt.rtmod.RTMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
  private static final Block FOSSIL_BLOCK = registerBlock("fossil_block",
    new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.BONE))
  );

  private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);

    return Registry.register(Registries.BLOCK, Identifier.of(RTMod.MOD_ID, name), block);
  }

  private static void registerBlockItem(String name, Block block) {
    Registry.register(Registries.ITEM, Identifier.of(RTMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
  }

  public static void registerModBlocks() {
    RTMod.LOGGER.info("Registering blocks for " + RTMod.MOD_ID);
  }
}

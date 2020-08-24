package net.coloredplanks.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class coloredplanks implements ModInitializer

{
	// adds instances for our new blocks
	public static final Block WHITE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block ORANGE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block MAGENTA_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block LIGHT_BLUE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block YELLOW_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block LIME_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block PINK_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block GRAY_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block LIGHT_GRAY_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block CYAN_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block BLUE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block PURPLE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block GREEN_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block BROWN_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block RED_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());
	public static final Block BLACK_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).hardness(2.0F).resistance(5.0F).build());

	@Override
	public void onInitialize()

	// WHITE PLANKS
	{
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "white_planks"), WHITE_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "white_planks"), new BlockItem(WHITE_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// ORANGE PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "orange_planks"), ORANGE_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "orange_planks"), new BlockItem(ORANGE_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// MAGENTA PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "magenta_planks"), MAGENTA_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "magenta_planks"), new BlockItem(MAGENTA_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// LIGHT BLUE PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "light_blue_planks"), LIGHT_BLUE_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "light_blue_planks"), new BlockItem(LIGHT_BLUE_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// YELLOW PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "yellow_planks"), YELLOW_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "yellow_planks"), new BlockItem(YELLOW_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// LIME PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "lime_planks"), LIME_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "lime_planks"), new BlockItem(LIME_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// PINK PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "pink_planks"), PINK_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "pink_planks"), new BlockItem(PINK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// GRAY PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "gray_planks"), GRAY_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "gray_planks"), new BlockItem(GRAY_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// LIGHT GRAY PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "light_gray_planks"), LIGHT_GRAY_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "light_gray_planks"), new BlockItem(LIGHT_GRAY_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// CYAN PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "cyan_planks"), CYAN_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "cyan_planks"), new BlockItem(CYAN_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// BLUE PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "blue_planks"), BLUE_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "blue_planks"), new BlockItem(BLUE_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// PURPLE PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "purple_planks"), PURPLE_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "purple_planks"), new BlockItem(PURPLE_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// GREEN PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "green_planks"), GREEN_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "green_planks"), new BlockItem(GREEN_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// BROWN PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "brown_planks"), BROWN_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "brown_planks"), new BlockItem(BROWN_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// RED PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "red_planks"), RED_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "red_planks"), new BlockItem(RED_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// BLACK PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("coloredplanks", "black_planks"), BLACK_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("coloredplanks", "black_planks"), new BlockItem(BLACK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

}
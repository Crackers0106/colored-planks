package net.coloredplanks.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class coloredplanks implements ModInitializer

{
	// adds instances for our new blocks
	public static final Block WHITE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block ORANGE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block MAGENTA_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block LIGHT_BLUE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block YELLOW_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block LIME_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block PINK_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block GRAY_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block LIGHT_GRAY_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block CYAN_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block BLUE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block PURPLE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block GREEN_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block BROWN_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block RED_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());
	public static final Block BLACK_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).build());

	@Override
	public void onInitialize()

	// WHITE PLANKS
	{
		Registry.register(Registry.BLOCK, new Identifier("White Planks", "white_planks"), WHITE_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("White Planks", "white_planks"), new BlockItem(WHITE_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// ORANGE PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Orange Planks", "orange_planks"), ORANGE_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Orange Planks", "orange_planks"), new BlockItem(ORANGE_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// MAGENTA PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Magenta Planks", "magenta_planks"), MAGENTA_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Magenta Planks", "magenta_planks"), new BlockItem(MAGENTA_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// LIGHT BLUE PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Light Blue Planks", "light_blue_planks"), LIGHT_BLUE_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Light Blue Planks", "light_blue_planks"), new BlockItem(LIGHT_BLUE_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// YELLOW PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Yellow Planks", "yellow_planks"), YELLOW_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Yellow Planks", "yellow_planks"), new BlockItem(YELLOW_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// LIME PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Lime Planks", "lime_planks"), LIME_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Lime Planks", "lime_planks"), new BlockItem(LIME_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// PINK PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Pink Planks", "pink_planks"), PINK_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Pink Planks", "pink_planks"), new BlockItem(PINK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// GRAY PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Gray Planks", "gray_planks"), GRAY_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Gray Planks", "gray_planks"), new BlockItem(GRAY_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// LIGHT GRAY PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Light Gray Planks", "light_gray_planks"), LIGHT_GRAY_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Light Gray Planks", "light_gray_planks"), new BlockItem(LIGHT_GRAY_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// CYAN PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Cyan Planks", "cyan_planks"), CYAN_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Cyan Planks", "cyan_planks"), new BlockItem(CYAN_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// BLUE PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Blue Planks", "blue_planks"), BLUE_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Blue Planks", "blue_planks"), new BlockItem(BLUE_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// PURPLE PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Purple Planks", "purple_planks"), PURPLE_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Purple Planks", "purple_planks"), new BlockItem(PURPLE_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// GREEN PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Green Planks", "green_planks"), GREEN_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Green Planks", "green_planks"), new BlockItem(GREEN_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// BROWN PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Brown Planks", "brown_planks"), BROWN_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Brown Planks", "brown_planks"), new BlockItem(BROWN_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// RED PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Red Planks", "red_planks"), RED_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Red Planks", "red_planks"), new BlockItem(RED_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

	// BLACK PLANKS
	static {
		Registry.register(Registry.BLOCK, new Identifier("Black Planks", "black_planks"), BLACK_PLANKS);

		// block registration
		Registry.register(Registry.ITEM, new Identifier("Black Planks", "black_planks"), new BlockItem(BLACK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

}
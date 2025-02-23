package mod.yourmediocrepal.noel.init;

import mod.yourmediocrepal.noel.Noel;
import mod.yourmediocrepal.noel.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class NoelBlocks<pubic> {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Noel.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Blocks
    //public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", BlockBase::new);
    public static final RegistryObject<Block> ADVENT_CALENDAR = BLOCKS.register("advent_calendar", BlockAdventCalendar::new);
    public static final RegistryObject<Block> CANDLE = BLOCKS.register("candle", BlockCandle::new);
    public static final RegistryObject<Block> WALL_CANDLE = BLOCKS.register("wall_candle", BlockWallCandle::new);
    public static final RegistryObject<Block> GLOWSTONE_STAR = BLOCKS.register("glowstone_star", BlockStar::new);
    public static final RegistryObject<Block> GOLD_STAR = BLOCKS.register("gold_star", BlockStar::new);
    public static final RegistryObject<Block> KETTLE = BLOCKS.register("kettle", BlockKettle::new);
    public static final RegistryObject<Block> FROSTED_LOG = BLOCKS.register("frosted_log", BlockLogs::new);
    public static final RegistryObject<Block> FROSTED_PLANKS = BLOCKS.register("frosted_planks", BlockPlanks::new);
    public static final RegistryObject<Block> FROSTED_TRAPDOOR = BLOCKS.register("frosted_trapdoor", BlockTrapDoor::new);
    public static final RegistryObject<Block> FROSTED_SLAB = BLOCKS.register("frosted_slab", BlockSlab::new);
    public static final RegistryObject<Block> FROSTED_STAIRS = BLOCKS.register("frosted_stairs", () -> new BlockStairs(NoelBlocks.FROSTED_PLANKS.get().getDefaultState()));
    public static final RegistryObject<Block> FROSTED_DOOR = BLOCKS.register("frosted_door", BlockDoor::new);
    public static final RegistryObject<Block> FROSTED_FENCE = BLOCKS.register("frosted_fence", BlockFence::new);
    public static final RegistryObject<Block> FROSTED_FENCE_GATE = BLOCKS.register("frosted_fence_gate", BlockFenceGate::new);
    public static final RegistryObject<Block> FROSTED_BUTTON = BLOCKS.register("frosted_button", BlockButton::new);
    public static final RegistryObject<Block> FROSTED_PRESSURE_PLATE = BLOCKS.register("frosted_pressure_plate", BlockPressurePlate::new);
    public static final RegistryObject<Block> SPIRIT_ORE = BLOCKS.register("spirit_ore", BlockOre::new);
    public static final RegistryObject<Block> STONE_PATH = BLOCKS.register("stone_path", BlockStonePath::new);
    public static final RegistryObject<Block> PEPPERMINT_LOG = BLOCKS.register("peppermint_log", BlockLogs::new);
    public static final RegistryObject<Block> PEPPERMINT_PLANKS = BLOCKS.register("peppermint_planks", BlockPlanks::new);
    public static final RegistryObject<Block> PEPPERMINT_TRAPDOOR = BLOCKS.register("peppermint_trapdoor", BlockTrapDoor::new);
    public static final RegistryObject<Block> PEPPERMINT_SLAB = BLOCKS.register("peppermint_slab", BlockSlab::new);
    public static final RegistryObject<Block> PEPPERMINT_STAIRS = BLOCKS.register("peppermint_stairs", () -> new BlockStairs(NoelBlocks.PEPPERMINT_PLANKS.get().getDefaultState()));
    public static final RegistryObject<Block> PEPPERMINT_DOOR = BLOCKS.register("peppermint_door", BlockDoor::new);
    public static final RegistryObject<Block> PEPPERMINT_FENCE = BLOCKS.register("peppermint_fence", BlockFence::new);
    public static final RegistryObject<Block> PEPPERMINT_FENCE_GATE = BLOCKS.register("peppermint_fence_gate", BlockFenceGate::new);
    public static final RegistryObject<Block> PEPPERMINT_BUTTON = BLOCKS.register("peppermint_button", BlockButton::new);
    public static final RegistryObject<Block> PEPPERMINT_PRESSURE_PLATE = BLOCKS.register("peppermint_pressure_plate", BlockPressurePlate::new);
    public static final RegistryObject<Block> PEPPERMINT_WALL = BLOCKS.register("peppermint_wall", BlockWall::new);
    public static final RegistryObject<Block> PRESENT = BLOCKS.register("present", BlockPresent::new);
    public static final RegistryObject<Block> PRESENT_TRAP = BLOCKS.register("present_trap", BlockPresentTrap::new);
    public static final RegistryObject<Block> WREATH = BLOCKS.register("wreath", BlockWreath::new);
    public static final RegistryObject<Block> SHRUB_TREE = BLOCKS.register("shrub_tree", BlockShrubTree::new);
    public static final RegistryObject<Block> POINSETTIA = BLOCKS.register("poinsettia", BlockFlower::new);
    public static final RegistryObject<Block> POTTED_POINSETTIA = BLOCKS.register("potted_poinsettia", BlockPoinsettiaPot::new);
    public static final RegistryObject<Block> MISTLETOE = BLOCKS.register("mistletoe", BlockMistletoe::new);
    public static final RegistryObject<Block> GINGER_BREAD_BLOCK = BLOCKS.register("ginger_bread_block", BlockPlanks::new);
    public static final RegistryObject<Block> GINGER_BREAD_SLAB = BLOCKS.register("ginger_bread_slab", BlockSlab::new);
    public static final RegistryObject<Block> GINGER_BREAD_STAIRS = BLOCKS.register("ginger_bread_stairs", () -> new BlockStairs(NoelBlocks.GINGER_BREAD_BLOCK.get().getDefaultState()));
    public static final RegistryObject<Block> GINGER_BREAD_DOOR = BLOCKS.register("ginger_bread_door", BlockDoor::new);
    public static final RegistryObject<Block> GINGER_BREAD_WALL = BLOCKS.register("ginger_bread_wall", BlockWall::new);

    public static final RegistryObject<Block> RED_GUMDROP = BLOCKS.register("red_gumdrop", BlockGumdrop::new);
    public static final RegistryObject<Block> ORANGE_GUMDROP = BLOCKS.register("orange_gumdrop", BlockGumdrop::new);
    public static final RegistryObject<Block> YELLOW_GUMDROP = BLOCKS.register("yellow_gumdrop", BlockGumdrop::new);
    public static final RegistryObject<Block> GREEN_GUMDROP = BLOCKS.register("green_gumdrop", BlockGumdrop::new);
    public static final RegistryObject<Block> BLUE_GUMDROP = BLOCKS.register("blue_gumdrop", BlockGumdrop::new);
    public static final RegistryObject<Block> PURPLE_GUMDROP = BLOCKS.register("purple_gumdrop", BlockGumdrop::new);
    //public static final RegistryObject<Block> LIGHT_STRING = BLOCKS.register("light_string", BlockLightString::new);

    //ORNAMENT
    public static final RegistryObject<Block> ORNAMENT = BLOCKS.register("ornament", BlockOrnament::new);
    public static final RegistryObject<Block> COAL_ORNAMENT = BLOCKS.register("coal_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> DIAMOND_ORNAMENT = BLOCKS.register("diamond_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> EMERALD_ORNAMENT = BLOCKS.register("emerald_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> GLASS_ORNAMENT = BLOCKS.register("glass_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> GOLD_ORNAMENT = BLOCKS.register("gold_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> IRON_ORNAMENT = BLOCKS.register("iron_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> REDSTONE_ORNAMENT = BLOCKS.register("redstone_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> LAPIS_ORNAMENT = BLOCKS.register("lapis_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> BLACK_ORNAMENT = BLOCKS.register("black_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> BLUE_ORNAMENT = BLOCKS.register("blue_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> BROWN_ORNAMENT = BLOCKS.register("brown_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> CYAN_ORNAMENT = BLOCKS.register("cyan_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> GRAY_ORNAMENT = BLOCKS.register("gray_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> GREEN_ORNAMENT = BLOCKS.register("green_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> LIGHT_BLUE_ORNAMENT = BLOCKS.register("light_blue_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> LIME_ORNAMENT = BLOCKS.register("lime_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> MAGENTA_ORNAMENT = BLOCKS.register("magenta_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> ORANGE_ORNAMENT = BLOCKS.register("orange_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> PINK_ORNAMENT = BLOCKS.register("pink_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> PURPLE_ORNAMENT = BLOCKS.register("purple_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> RED_ORNAMENT = BLOCKS.register("red_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> LIGHT_GRAY_ORNAMENT = BLOCKS.register("light_gray_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> WHITE_ORNAMENT = BLOCKS.register("white_ornament", BlockOrnament::new);
    public static final RegistryObject<Block> YELLOW_ORNAMENT = BLOCKS.register("yellow_ornament", BlockOrnament::new);

    //STOCKING
    public static final RegistryObject<Block> BLACK_STOCKING = BLOCKS.register("black_stocking", BlockStocking::new);
    public static final RegistryObject<Block> BLUE_STOCKING = BLOCKS.register("blue_stocking", BlockStocking::new);
    public static final RegistryObject<Block> BROWN_STOCKING = BLOCKS.register("brown_stocking", BlockStocking::new);
    public static final RegistryObject<Block> CYAN_STOCKING = BLOCKS.register("cyan_stocking", BlockStocking::new);
    public static final RegistryObject<Block> GRAY_STOCKING = BLOCKS.register("gray_stocking", BlockStocking::new);
    public static final RegistryObject<Block> GREEN_STOCKING = BLOCKS.register("green_stocking", BlockStocking::new);
    public static final RegistryObject<Block> LIGHT_BLUE_STOCKING = BLOCKS.register("light_blue_stocking", BlockStocking::new);
    public static final RegistryObject<Block> LIME_STOCKING = BLOCKS.register("lime_stocking", BlockStocking::new);
    public static final RegistryObject<Block> MAGENTA_STOCKING = BLOCKS.register("magenta_stocking", BlockStocking::new);
    public static final RegistryObject<Block> ORANGE_STOCKING = BLOCKS.register("orange_stocking", BlockStocking::new);
    public static final RegistryObject<Block> PINK_STOCKING = BLOCKS.register("pink_stocking", BlockStocking::new);
    public static final RegistryObject<Block> PURPLE_STOCKING = BLOCKS.register("purple_stocking", BlockStocking::new);
    public static final RegistryObject<Block> RED_STOCKING = BLOCKS.register("red_stocking", BlockStocking::new);
    public static final RegistryObject<Block> LIGHT_GRAY_STOCKING = BLOCKS.register("light_gray_stocking", BlockStocking::new);
    public static final RegistryObject<Block> WHITE_STOCKING = BLOCKS.register("white_stocking", BlockStocking::new);
    public static final RegistryObject<Block> YELLOW_STOCKING = BLOCKS.register("yellow_stocking", BlockStocking::new);

    //DONATION BOOTH
    public static final RegistryObject<Block> DONATION_BOOTH = BLOCKS.register("donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> BLACK_DONATION_BOOTH = BLOCKS.register("black_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> BLUE_DONATION_BOOTH = BLOCKS.register("blue_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> BROWN_DONATION_BOOTH = BLOCKS.register("brown_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> CYAN_DONATION_BOOTH = BLOCKS.register("cyan_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> GRAY_DONATION_BOOTH = BLOCKS.register("gray_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> GREEN_DONATION_BOOTH = BLOCKS.register("green_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> LIGHT_BLUE_DONATION_BOOTH = BLOCKS.register("light_blue_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> LIGHT_GRAY_DONATION_BOOTH = BLOCKS.register("light_gray_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> LIME_DONATION_BOOTH = BLOCKS.register("lime_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> MAGENTA_DONATION_BOOTH = BLOCKS.register("magenta_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> ORANGE_DONATION_BOOTH = BLOCKS.register("orange_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> PINK_DONATION_BOOTH = BLOCKS.register("pink_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> PURPLE_DONATION_BOOTH = BLOCKS.register("purple_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> RED_DONATION_BOOTH = BLOCKS.register("red_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> WHITE_DONATION_BOOTH = BLOCKS.register("white_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> YELLOW_DONATION_BOOTH = BLOCKS.register("yellow_donation_booth", BlockDonationBooth::new);
    public static final RegistryObject<Block> PEPPERMINT_DONATION_BOOTH = BLOCKS.register("peppermint_donation_booth", BlockDonationBooth::new);

    //RIBBON
    public static final RegistryObject<Block> BLACK_RIBBON = BLOCKS.register("black_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> BLUE_RIBBON = BLOCKS.register("blue_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> BROWN_RIBBON = BLOCKS.register("brown_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> CYAN_RIBBON = BLOCKS.register("cyan_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> GRAY_RIBBON = BLOCKS.register("gray_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> GREEN_RIBBON = BLOCKS.register("green_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> LIGHT_BLUE_RIBBON = BLOCKS.register("light_blue_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> LIGHT_GRAY_RIBBON = BLOCKS.register("light_gray_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> LIME_RIBBON = BLOCKS.register("lime_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> MAGENTA_RIBBON = BLOCKS.register("magenta_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> ORANGE_RIBBON = BLOCKS.register("orange_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> PINK_RIBBON = BLOCKS.register("pink_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> PURPLE_RIBBON = BLOCKS.register("purple_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> RED_RIBBON = BLOCKS.register("red_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> WHITE_RIBBON = BLOCKS.register("white_ribbon", BlockRibbon::new);
    public static final RegistryObject<Block> YELLOW_RIBBON = BLOCKS.register("yellow_ribbon", BlockRibbon::new);

}

package mod.yourmediocrepal.noel.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class BlockLogs extends Block {
    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

    public BlockLogs() {
        super(Properties.create(Material.WOOD)
            .hardnessAndResistance(2.0f,2.0f)
            .sound(SoundType.WOOD)
            .harvestTool(ToolType.AXE)
            .setRequiresTool()
        );

        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        switch(rot) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch((Direction.Axis)state.get(AXIS)) {
                    case X:
                        return state.with(AXIS, Direction.Axis.Z);
                    case Z:
                        return state.with(AXIS, Direction.Axis.X);
                    default:
                        return state;
                }
            default:
                return state;
        }
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(AXIS, context.getFace().getAxis());
    }

}

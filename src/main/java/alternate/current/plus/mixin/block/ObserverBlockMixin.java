package alternate.current.plus.mixin.block;

import org.spongepowered.asm.mixin.Mixin;

import alternate.current.plus.interfaces.mixin.IBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.ObserverBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

@Mixin(ObserverBlock.class)
public class ObserverBlockMixin implements IBlock {

	@Override
	public boolean isSignalSourceTo(Level level, BlockPos pos, BlockState state, Direction dir) {
		return state.getValue(BlockStateProperties.FACING) == dir;
	}

	@Override
	public boolean isDirectSignalSourceTo(Level level, BlockPos pos, BlockState state, Direction dir) {
		return state.getValue(BlockStateProperties.FACING) == dir;
	}
}

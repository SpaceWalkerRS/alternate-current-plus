package alternate.current.plus.mixin.block;

import org.spongepowered.asm.mixin.Mixin;

import alternate.current.plus.interfaces.mixin.IBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.PoweredBlock;
import net.minecraft.world.level.block.state.BlockState;

@Mixin(PoweredBlock.class)
public class PoweredBlockMixin implements IBlock {

	@Override
	public boolean isSignalSourceTo(Level level, BlockPos pos, BlockState state, Direction dir) {
		return true;
	}
}

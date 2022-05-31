package com.maybeapexin.asteroid.registry.items.fluids;

import com.maybeapexin.asteroid.registry.objReg.BaseFluid;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

import static com.maybeapexin.asteroid.registry.ModRegistry.*;

public abstract class Acid extends BaseFluid {
    @Override
    public Fluid getStill() {
        return STILL_ACID;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_ACID;
    }

    @Override
    public Item getBucketItem() {
        return ACID_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        return ACID.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
    }

    public static class Flowing extends Acid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends Acid {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }



}

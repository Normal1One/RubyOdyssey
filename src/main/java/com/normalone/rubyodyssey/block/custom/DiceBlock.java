package com.normalone.rubyodyssey.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import org.jetbrains.annotations.Nullable;

public class DiceBlock extends Block {
    public static DirectionProperty FACING = DirectionProperty.of("number",
            Direction.UP,
            Direction.DOWN,
            Direction.NORTH,
            Direction.EAST,
            Direction.WEST,
            Direction.SOUTH);

    public DiceBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return getRandomBlockState();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public BlockState getRandomBlockState() {
        return this.getDefaultState().with(FACING, getRandomDirection());
    }

    private Direction getRandomDirection() {
        Direction[] dirs = new Direction[] {
                Direction.UP,
                Direction.DOWN,
                Direction.NORTH,
                Direction.EAST,
                Direction.WEST,
                Direction.SOUTH
        };

        return dirs[Random.create().nextBetween(0, dirs.length - 1)];
    }
}

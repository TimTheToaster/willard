package baguchan.revampedwolf.entity;

import jdk.nashorn.internal.ir.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

import static baguchan.revampedwolf.init.ModEntityTypes.WILLARD;

public class WillardSpawnEggItem extends SpawnEggItem {
    static WillardEntity instance = null;

    public WillardSpawnEggItem() {
        super(WILLARD, 9804699, 0x582827, new Item.Properties().group(ItemGroup.MISC));
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        BlockPos pos = context.getPos();
        if (instance != null){
            instance.teleportKeepLoaded(pos.getX(), pos.getY()+1, pos.getZ());
            return ActionResultType.SUCCESS;
        } else {
            return super.onItemUse(context);
        }
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ActionResult<ItemStack> itemStackActionResult = super.onItemRightClick(worldIn, playerIn, handIn);
        itemStackActionResult.getResult()
        return itemStackActionResult;
    }

    @Override
    public Optional<MobEntity> getChildToSpawn(PlayerEntity player, MobEntity mob, EntityType<? extends MobEntity> entityType, ServerWorld world, Vector3d pos, ItemStack stack) {
        if (instance == null) {
            instance = (WillardEntity) mob;
        }
        return Optional.of(instance);
    }
}

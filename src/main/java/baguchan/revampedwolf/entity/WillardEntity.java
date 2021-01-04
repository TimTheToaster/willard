package baguchan.revampedwolf.entity;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class WillardEntity extends WolfEntity {
    private static WillardEntity instance = null;
    public WillardEntity(EntityType<? extends WolfEntity> type, World worldIn) {
        super(type, worldIn);
        instance = this;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return null;
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        if (entityIn instanceof PlayerEntity || entityIn instanceof WillardEntity) {
            return false;
        }
        return super.attackEntityAsMob(entityIn);
    }


    public static AttributeModifierMap.MutableAttribute setCustomAttributes(){
        return WolfEntity.func_234233_eS_();
    }

    @Override
    public void onKillCommand() {
        super.onKillCommand();
        this.remove();
    }

    @Override
    public boolean isChild() {
        return false;
    }

    @Override
    public float getRenderScale() {
        return 1.5f * super.getRenderScale();
    }

    @Override
    protected void damageEntity(DamageSource damageSrc, float damageAmount) {

    }

    @Override
    public boolean canDespawn(double distanceToClosestPlayer) {
        return false;
    }

    @Override
    public boolean canSpawn(IWorld worldIn, SpawnReason spawnReasonIn) {
        if (
            spawnReasonIn.equals(SpawnReason.COMMAND)
            || spawnReasonIn.equals(SpawnReason.SPAWN_EGG)
        ) {
            return true;
        }
        return false;
    }

}

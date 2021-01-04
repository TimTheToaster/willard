package baguchan.revampedwolf.init;

import baguchan.revampedwolf.RevampedWolfCore;
import baguchan.revampedwolf.entity.WillardEntity;
import baguchan.revampedwolf.entity.WillardSpawnEggItem;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.*;

@Mod.EventBusSubscriber(modid = RevampedWolfCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, RevampedWolfCore.MODID);
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RevampedWolfCore.MODID);

    public static final EntityType<WillardEntity> WILLARD = (EntityType<WillardEntity>) EntityType.Builder.create(WillardEntity::new, EntityClassification.CREATURE).size(1.5f, 1.5f).build("willard");

    public static final RegistryObject<EntityType<WillardEntity>> WILLARD_REG = ENTITY_TYPES.register("willard", ()-> WILLARD);

    public static final RegistryObject<Item> WILLARD_EGG = ITEMS.register("willard_spawn_egg", ()->new WillardSpawnEggItem());
}

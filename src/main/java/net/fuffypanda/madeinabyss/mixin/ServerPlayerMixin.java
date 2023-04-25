
package net.fuffypanda.madeinabyss.mixin;

import net.fuffypanda.madeinabyss.MadeInAbyss;
import net.fuffypanda.madeinabyss.worlds.dimension.ModDimensions;
import net.minecraft.block.BeaconBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MangroveLeavesBlock;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import org.apache.logging.log4j.core.jmx.Server;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.UUID;

@Mixin(ServerPlayerEntity.class)


public abstract class ServerPlayerMixin extends LivingEntity {


    @Inject( method = "tick", at = @At("RETURN"))
    void onTick(CallbackInfo ci) {      //Run this code every tick


        BlockPos posBelowPlayer = getBlockPos().down();
        BlockState state = world.getBlockState(posBelowPlayer);
        Block block = state.getBlock();
        ServerPlayerEntity player = (ServerPlayerEntity) (Object) this; //courtesy of griffin4cats
        ServerWorld teleportWorld;

        /*
        RegistryKey<World> worldKey = world.getRegistryKey();
        String worldKeyString = worldKey.toString();
        player.sendMessage(Text.of("World registry key:" + worldKeyString));

        String overworldKey = String.valueOf(player.getWorld().getRegistryKey());
        player.sendMessage(Text.of(overworldKey));
        */


        if(player.getY() < -65) {
            System.out.println("reached y=-65");
            player.sendMessage(Text.of("reached y=-65"));
            teleportWorld = this.getServer().getWorld(ModDimensions.getLayerTestDimensionKey());
            player.teleport(teleportWorld, getX(), 325, getZ(), this.getYaw(), this.getPitch());
        }

    }

    protected ServerPlayerMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }






}
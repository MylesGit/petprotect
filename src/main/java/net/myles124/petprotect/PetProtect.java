package net.myles124.petprotect;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.util.ActionResult;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;

public class PetProtect implements ModInitializer {

	@Override
	public void onInitialize() {
		// Register event listener for when a player attacks an entity
		AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			// Prevent damage to tameable entities like wolves, cats, etc.
			if (entity instanceof TameableEntity tameableEntity) {
				// Check if the player is the owner of the pet
				if (tameableEntity.getOwnerUuid() != null && tameableEntity.getOwnerUuid().equals(player.getUuid())) {
					// Cancel the attack if the player is the pet's owner
					return ActionResult.FAIL;
				}
			}

			// Prevent damage to horses and similar entities (horses, donkeys, mules)
			if (entity instanceof AbstractHorseEntity horseEntity) {
				// Check if the player is the owner of the horse
				if (horseEntity.getOwnerUuid() != null && horseEntity.getOwnerUuid().equals(player.getUuid())) {
					// Cancel the attack if the player is the horse's owner
					return ActionResult.FAIL;
				}
			}

			// Allow normal behavior for other entities
			return ActionResult.PASS;
		});
	}
}

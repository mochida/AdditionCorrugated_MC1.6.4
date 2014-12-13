package AdditionCorrugated;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import AdditionCorrugated.AdditionCorrugatedCore;
import AdditionCorrugated.ItemPolishngPowder;

public class PolishngPowderDrop {
	
	@ForgeSubscribe
	public void onLivingDeathEvent(LivingDeathEvent event) {
		if(event.entityLiving.worldObj.isRemote) {
			return;
		}
		if(event.entityLiving instanceof EntityCreeper) {
			if(event.entityLiving.worldObj.rand.nextInt(10) == 0) {
				event.entityLiving.dropItem(AdditionCorrugatedCore.itemPolishngPowder.itemID, 1);
			}
		}
	}

}

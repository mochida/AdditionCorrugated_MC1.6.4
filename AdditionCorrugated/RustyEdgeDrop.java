package AdditionCorrugated;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import AdditionCorrugated.AdditionCorrugatedCore;
import AdditionCorrugated.ItemRustyEdge;

public class RustyEdgeDrop {
	
	@ForgeSubscribe
	public void onLivingDeathEvent(LivingDeathEvent event) {
		if(event.entityLiving.worldObj.isRemote) {
			return;
		}
		if(event.entityLiving instanceof EntityZombie) {
			if(event.entityLiving.worldObj.rand.nextInt(10) == 0) {
				event.entityLiving.dropItem(AdditionCorrugatedCore.itemRustyEdge.itemID, 1);
			}
		}
	}

}

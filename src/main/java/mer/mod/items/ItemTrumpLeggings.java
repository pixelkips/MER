package mer.mod.items;

import net.minecraft.item.ItemArmor;

public class ItemTrumpLeggings extends ItemArmor{
    public ItemTrumpLeggings(ItemArmor.ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn){
        super(material, renderIndex, equipmentSlotIn);
        setUnlocalizedName(Reference.ModItems.TRUMPLEGGINGS.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPLEGGINGS.getRegistryName());
    }
}

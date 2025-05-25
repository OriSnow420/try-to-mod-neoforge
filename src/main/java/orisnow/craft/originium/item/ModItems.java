package orisnow.craft.originium.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import orisnow.craft.originium.OriginiumIndustry;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OriginiumIndustry.MOD_ID);

    public static final DeferredItem<Item> ORIGINIUM_SHARP = ITEMS.register("originium_sharp",
            () -> new Item(
                    new Item.Properties()
                            .useItemDescriptionPrefix()
                            .setId(
                                    ResourceKey.create(
                                            Registries.ITEM,
                                            ResourceLocation.parse("originium:originium_sharp"))
                            )
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

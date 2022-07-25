package net.chasical.modcourse.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab COURSE_TAB = new CreativeModeTab("randomtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RANDOM_ITEM.get());
        }
    };
}

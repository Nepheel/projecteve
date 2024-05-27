package net.nepheel.projecteve.mixin;

import net.minecraft.client.render.DimensionEffects;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(DimensionEffects.class)
public abstract class DimensionEffectsAccessorMixin {
    @Accessor("BY_IDENTIFIER")
    public static void register(Identifier id, DimensionEffects effects) {
        throw new UnsupportedOperationException();
    }
}

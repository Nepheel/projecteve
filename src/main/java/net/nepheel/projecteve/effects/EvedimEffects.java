package net.nepheel.projecteve.effects;

import net.minecraft.client.render.DimensionEffects;
import net.minecraft.util.math.Vec3d;

public class EvedimEffects extends DimensionEffects {
    public EvedimEffects() {
        super(448.0f, false, SkyType.NORMAL, false, false);
    }

    @Override
    public Vec3d adjustFogColor(Vec3d color, float sunHeight) {
        //Farbe des Himmels anpassen, return color
        return color;
    }

    @Override
    public boolean useThickFog(int camX, int camY) {
        //Bestimmt, ob dichter Nebel verwendet wird
        return false;
    }
}


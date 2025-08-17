package net.evoltmael.kamenridergavvmod.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_KRGAVVMOD = "key.cotegory.KRGavvMod.kamenrider";
    public static final String KEY_HENSHIN = "key.KRGavvMod.henshin";

    public static final KeyMapping HENSHIN_KEY = new KeyMapping(KEY_HENSHIN, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_H, KEY_CATEGORY_KRGAVVMOD);

}

package net.fuffypanda.madeinabyss.sound;

import net.fuffypanda.madeinabyss.MadeInAbyss;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    //papa's lullaby//
    public static SoundEvent MADEINABYSS_SONG_1 = registerSoundEvent("madeinabyss_song_1");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MadeInAbyss.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

}

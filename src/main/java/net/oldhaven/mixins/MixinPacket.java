package net.oldhaven.mixins;

import net.minecraft.src.Packet;
import net.oldhaven.customs.packets.Packet195Custom;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Packet.class)
public abstract class MixinPacket {
    @Shadow static void addIdClassMapping(int i, boolean b, boolean b1, Class aClass) {}

    static {
        addIdClassMapping(195, true, true, Packet195Custom.class);
    }
}

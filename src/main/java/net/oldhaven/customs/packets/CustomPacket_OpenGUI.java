package net.oldhaven.customs.packets;

import net.minecraft.src.GuiScreen;
import net.oldhaven.gui.GuiEXP;

import java.util.HashMap;
import java.util.Map;

public class CustomPacket_OpenGUI extends CustomPacket {
    private Map<String, GuiScreen> guis = new HashMap<String, GuiScreen>(){
        {
            put("exp", new GuiEXP());
        }
    };

    @Override
    public void run(String[] args) {

    }

    @Override
    public CustomPacketType getType() {
        return CustomPacketType.GUI;
    }
}

package spaceCoder.riftcraft.lib.utility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class ChatMessageHelper
{
    public static void sendMessage(String message, EntityPlayer player)
    {
        player.addChatComponentMessage(new ChatComponentText(message));
    }
}

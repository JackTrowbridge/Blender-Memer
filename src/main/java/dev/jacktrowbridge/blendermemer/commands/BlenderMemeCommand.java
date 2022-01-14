package dev.jacktrowbridge.blendermemer.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class BlenderMemeCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        Message message = event.getMessage();
        if(message.getContentRaw().equalsIgnoreCase("!blendermeme")){
            MessageChannel channel = message.getGuildChannel();

            // Create the EmbedBuilder instance
            EmbedBuilder eb = new EmbedBuilder();

/*
    Set the title:
    1. Arg: title as string
    2. Arg: URL as string or could also be null
 */
            eb.setTitle("Blender Meme", null);

/*
    Set the color
 */
            eb.setColor(new Color(235, 125, 52));

/*
    Set the text of the Embed:
    Arg: text as string
 */
            eb.setDescription("Here's a good ol' blender meme. Happy UV unwrapping!");

/*
    Add embed author:
    1. Arg: name as string
    2. Arg: url as string (can be null)
    3. Arg: icon url as string (can be null)
 */
            eb.setAuthor("Blender Memer", null, null);

/*
    Set footer:
    1. Arg: text as string
    2. icon url as string (can be null)
 */
            eb.setFooter("discord.gg/blender", null);

/*
    Set image:
    Arg: image url as string
 */

            eb.setImage("https://raw.githubusercontent.com/zekroTJA/DiscordBot/master/.websrc/logo%20-%20title.png");

            channel.sendMessageEmbeds(eb.build()).queue();
        }
    }

}



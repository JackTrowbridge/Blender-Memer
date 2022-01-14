package dev.jacktrowbridge.blendermemer;

import dev.jacktrowbridge.blendermemer.commands.BlenderMemeCommand;
import dev.jacktrowbridge.blendermemer.constants.Token;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

public class BlenderMemer {

    public static void main(String[] args){
        try{
            ShardManager bot = DefaultShardManagerBuilder.createDefault(Token.TOKEN, GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES, GatewayIntent.GUILD_MESSAGE_REACTIONS, GatewayIntent.GUILD_VOICE_STATES)
                    .setStatus(OnlineStatus.DO_NOT_DISTURB)
                    .enableCache(CacheFlag.MEMBER_OVERRIDES)
                    .setActivity(Activity.watching("discord.gg/blender"))
                    .addEventListeners(new BlenderMemeCommand())
                    .build();
        }catch(LoginException e){
            System.out.println("Login was unsuccessful. Go shout at Jay.");
        }

    }

}

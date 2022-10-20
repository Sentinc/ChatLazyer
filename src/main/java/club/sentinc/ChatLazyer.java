package club.sentinc;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

public final class ChatLazyer extends JavaPlugin {
    public static final ChatLazyer INSTANCE = new ChatLazyer();

    private ChatLazyer() {
        super(new JvmPluginDescriptionBuilder("club.sentinc.chat-lazyer", "0.1.0")
                .name("ChatLazyer")
                .author("SoingSaika")
                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");
    }
}
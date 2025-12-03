package yourmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import yourmod.ui.ClickGuiScreen;

public class YourMod implements ModInitializer {

    public static final String MODID = "yourmod";

    @Override
    public void onInitialize() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player != null && org.lwjgl.glfw.GLFW.glfwGetKey(
                    MinecraftClient.getInstance().getWindow().getHandle(),
                    org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_SHIFT) == 1
            ) {
                client.setScreen(new ClickGuiScreen());
            }
        });
    }
}

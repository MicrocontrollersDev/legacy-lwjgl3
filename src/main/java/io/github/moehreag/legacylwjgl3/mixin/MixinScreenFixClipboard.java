package io.github.moehreag.legacylwjgl3.mixin;

import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(GuiScreen.class)
public class MixinScreenFixClipboard {

	/**
	 * @author moehreag
	 * @reason Fix clipboard access with GLFW
	 */
	@Overwrite
	public static String getClipboardString(){
		return GLFW.glfwGetClipboardString(Display.getHandle());
	}

	/**
	 * @author moehreag
	 * @reason Fix clipboard access with GLFW
	 */
	@Overwrite
	public static void setClipboardString(String string){
		GLFW.glfwSetClipboardString(Display.getHandle(), string);
	}
}

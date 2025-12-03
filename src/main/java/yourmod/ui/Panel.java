package yourmod.ui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.ColorHelper;

public class Panel {

    private final String title;
    private int x, y, width, height;

    public Panel(String title, int x, int y, int width, int height) {
        this.title = title;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void render(DrawContext ctx, int mouseX, int mouseY) {
        int bg = ColorHelper.Argb.getArgb(180, 20, 20, 20);
        ctx.fill(x, y, x + width, y + height, bg);
        ctx.drawText(ctx.getTextRenderer(), title, x + 8, y + 8, 0xFFFFFF, false);
    }

    public boolean mouseClicked(double mx, double my, int btn) {
        return mx >= x && mx <= x + width && my >= y && my <= y + height;
    }
}

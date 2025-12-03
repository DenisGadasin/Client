package yourmod.ui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;

public class ClickGuiScreen extends Screen {

    private final List<Panel> panels = new ArrayList<>();

    public ClickGuiScreen() {
        super(Text.literal("UI"));
        panels.add(new Panel("Combat", 20, 20, 100, 160));
        panels.add(new Panel("Movement", 140, 20, 100, 160));
        panels.add(new Panel("Render", 260, 20, 100, 160));
    }

    @Override
    public void render(DrawContext ctx, int mx, int my, float delta) {
        this.renderBackground(ctx);
        for (Panel p : panels) p.render(ctx, mx, my);
        super.render(ctx, mx, my, delta);
    }

    @Override
    public boolean mouseClicked(double mx, double my, int btn) {
        for (Panel p : panels) {
            if (p.mouseClicked(mx, my, btn)) return true;
        }
        return super.mouseClicked(mx, my, btn);
    }
}

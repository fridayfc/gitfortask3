package button;

import java.awt.*;

/**
 * 颜色按钮，设置按钮的背景色
 *
 * @author 201717025350李春林
 */
public class ColorButton extends DeractorButton {
    private Color color;

    public ColorButton(Button button, Color color) {
        super(button);
        this.color = color;
    }

    @Override
    public Button draw() {
        Button draw = super.draw();
        draw.setBackground(color);
        return draw;
    }
}

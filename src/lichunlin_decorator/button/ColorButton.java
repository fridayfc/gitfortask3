package lichunlin_decorator.button;

import java.awt.*;
import java.awt.Button;

/**
 * 颜色按钮，设置按钮的背景色
 *
 * @author 201717025350李春林
 */
public class ColorButton extends DeractorButton {
    private Color color;

    public ColorButton(java.awt.Button button, Color color) {
        super(button);
        this.color = color;
    }

    @Override
    public java.awt.Button draw() {
        Button draw = super.draw();
        draw.setBackground(color);
        return draw;
    }
}

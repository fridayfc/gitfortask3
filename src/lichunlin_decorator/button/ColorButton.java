package lichunlin_decorator.button;

import java.awt.*;
import java.awt.Button;

/**
 * ��ɫ��ť�����ð�ť�ı���ɫ
 *
 * @author 201717025350���
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

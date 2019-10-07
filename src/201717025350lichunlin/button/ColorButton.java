package button;

import java.awt.*;

/**
 * ��ɫ��ť�����ð�ť�ı���ɫ
 *
 * @author 201717025350���
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

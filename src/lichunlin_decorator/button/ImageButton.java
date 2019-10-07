package lichunlin_decorator.button;

import javax.swing.*;

/**
 * ͼ��ť����ͼƬΪ����
 *
 * @author 201717025350���
 */
public class ImageButton extends DeractorButton {
    private String imageUrl;

    public ImageButton(Button button, String imageUrl) {
        super(button);
        this.imageUrl = imageUrl;
    }

    @Override
    public Button draw() {
        Button draw = super.draw();
        ImageIcon icon = new ImageIcon(imageUrl);
        draw.setIcon(icon);
        return draw;
    }
}

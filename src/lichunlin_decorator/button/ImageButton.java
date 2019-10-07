package lichunlin_decorator.button;

import javax.swing.*;

/**
 * 图像按钮，以图片为背景
 *
 * @author 201717025350李春林
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

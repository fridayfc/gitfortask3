package lichunlin_decorator.button;

/**
 * �ı���ť
 *
 * @author 201717025350���
 */
public class TextButton extends DeractorButton {
    private String text;

    public TextButton(Button button, String text) {
        super(button);
        this.text = text;
    }

    @Override
    public Button draw() {
        Button draw = super.draw();
        draw.setText(text);
        return draw;
    }
}

package lichunlin_decorator.button;

/**
 * 文本按钮
 *
 * @author 201717025350李春林
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

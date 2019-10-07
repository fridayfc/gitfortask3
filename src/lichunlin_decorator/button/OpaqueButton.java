package lichunlin_decorator.button;

/**
 * 一个透明按钮
 *
 * @author 201717025350李春林
 */
public class OpaqueButton extends DeractorButton {
    public OpaqueButton(Button button) {
        super(button);
    }

    @Override
    public Button draw() {
        Button draw = super.draw();
        draw.setOpaque(false);
        return draw;
    }
}

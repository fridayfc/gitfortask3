package lichunlin_decorator.button;

/**
 * һ��͸����ť
 *
 * @author 201717025350���
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

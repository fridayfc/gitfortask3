package lichunlin_decorator.button;

/**
 * @author 201717025350���
 */
public class BasicButton extends Button {

    @Override
    public Button draw() {
        return new BasicButton();
    }
}

package lichunlin_decorator.button;

/**
 * @author 201717025350¿Ó¥∫¡÷
 */
public class DeractorButton extends Button{
    protected Button button;

    public DeractorButton(Button button) {
        this.button = button;
    }

    @Override
    public Button draw() {
        return button;
    }
}

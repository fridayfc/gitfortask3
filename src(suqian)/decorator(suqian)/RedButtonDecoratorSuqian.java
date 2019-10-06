package decorator;

public class RedButtonDecorator extends ComponentDecorator {
    public RedButtonDecorator(Component component) {
        super(component);
    }


    public void display() {
        this.setRedButton();
        super.display();
    }

    public void setRedButton() {
        System.out.println("���Ӻ�ɫ��ť��");
    }
}

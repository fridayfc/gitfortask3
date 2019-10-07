public class RedButtonDecorator extends ComponentDecorator {
    public RedButtonDecorator(Component component) {
        super(component);
    }


    @Override
    public void display() {
        this.setRedButton();
        super.display();
    }

    public void setRedButton() {
        System.out.println("增加红色按钮！");
    }
}

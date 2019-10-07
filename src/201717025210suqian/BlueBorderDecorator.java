
public class BlueBorderDecorator extends ComponentDecorator {
    public BlueBorderDecorator(Component component) {
        super(component);
    }


    @Override
    public void display() {
        this.setBlueBorder();
        super.display();


    }

    public void setBlueBorder() {
        System.out.println("为红色按钮增加蓝色边框！");
    }

    public void addBehavior() {
        System.out.println("新增黄色按钮！");
    }
}

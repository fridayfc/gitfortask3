package decorator;

/**
 * @author 201717025246���沨
 * @version 1.0
 * @date 2019/9/2 13:01
 */
public class MyDecorator extends ComponentDecorator {
    public MyDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();//��ʾ���༴�����display����
        System.out.println("��ʾMyDecorator�����沨��");
    }
}

package decorator;

/**
 * @author 201717025246王益波
 * @version 1.0
 * @date 2019/9/2 13:01
 */
public class MyDecorator extends ComponentDecorator {
    public MyDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();//显示父类即组件的display方法
        System.out.println("显示MyDecorator（王益波）");
    }
}

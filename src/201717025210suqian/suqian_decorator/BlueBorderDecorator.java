package decorator;

public class BlueBorderDecorator extends ComponentDecorator {
    public BlueBorderDecorator(Component component) {
        super(component);
    }


    public void display() {
        this.setBlueBorder();
        super.display();



    }

    public void setBlueBorder() {
        System.out.println("Ϊ��ɫ��ť������ɫ�߿�");
    }
    public void addBehavior(){
        System.out.println( "������ɫ��ť��" );
    }
}

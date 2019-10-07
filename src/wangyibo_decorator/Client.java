//designpatterns.decorator.Client.java
package wangyibo_decorator;

public class Client {
	public static void main(String args[]) {

		/**
		*@Author 201717025246���沨
		*@Date 2019/9/2
		*@Time 12:45
		*/
		Component component1;//ʹ�ó��󹹼�����ȫ������
		component1 = new ListBox();         //�������幹������
		component1 = new ScrollBarDecorator(component1); //����װ�κ�Ĺ�������
		component1 = new BlackBorderDecorator(component1); //��װ����һ�εĶ���ע����һ��װ�����У����еڶ���װ��
		component1.display();
        System.out.println();
		Component component2;//ʹ�ó��󹹼�����ȫ������
		component2 = new MyFrame();         //�������幹������
		component2 = new ScrollBarDecorator(component2); //����װ�κ�Ĺ�������
		component2 = new BlackBorderDecorator(component2); //��װ����һ�εĶ���ע����һ��װ�����У����еڶ���װ��
		component2 =new MyDecorator(component2);
		component2.display();

	}
}
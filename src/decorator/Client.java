//designpatterns.decorator.Client.java
package decorator;

import com.sun.org.glassfish.gmbal.Description;

public class Client {
	public static void main(String args[]) {
		Component component, componentSB, componentBB;  //使用抽象构件定义全部对象
		component = new Window();         //创建具体构件对象
		componentSB = new ScrollBarDecorator(component); //创建装饰后的构件对象        
		componentBB = new BlackBorderDecorator(componentSB); //将装饰了一次的对象注入另一个装饰类中，进行第二次装饰
		componentBB.display();

		/**
		*@Author 201717025246王益波
		*@Date 2019/9/2
		*@Time 12:45
		*/
		Component component1;//使用抽象构件定义全部对象
		component1 = new ListBox();         //创建具体构件对象
		component1 = new ScrollBarDecorator(component1); //创建装饰后的构件对象
		component1 = new BlackBorderDecorator(component1); //将装饰了一次的对象注入另一个装饰类中，进行第二次装饰
		component1.display();
       System.out.println();
		Component component2;//使用抽象构件定义全部对象
		component2 = new MyFrame();         //创建具体构件对象
		component2 = new ScrollBarDecorator(component2); //创建装饰后的构件对象
		component2 = new BlackBorderDecorator(component2); //将装饰了一次的对象注入另一个装饰类中，进行第二次装饰
		component2 =new MyDecorator(component2);
		component2.display();

	}
}
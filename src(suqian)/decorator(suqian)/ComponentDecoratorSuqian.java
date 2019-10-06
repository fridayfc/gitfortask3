//designpatterns.decorator.ComponentDecorator.java
package decorator;

public class ComponentDecorator extends Component {
	private Component component;  //ά�ֶԳ��󹹼����Ͷ��������
  
	//ע����󹹼����͵Ķ���
	public ComponentDecorator(Component component) {
		this.component = component;
	}

	public void display() {
		component.display();
	}
}
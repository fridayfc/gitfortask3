package lichunlin_decorator.button;

import javax.swing.*;
import java.awt.*;

/**
 * 测试类
 *
 * @author 201717025350李春林
 */
public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(200, 200, 400, 400);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());

        BasicButton basicButton = new BasicButton();
        ImageButton imageButton = new ImageButton(basicButton.draw(), "src\\201717025350lichunlin\\images\\panda.png");
        ColorButton colorButton = new ColorButton(imageButton.draw(), Color.RED);
        TextButton textButton = new TextButton(colorButton.draw(), "我是一个按钮");
        contentPane.add(textButton.draw());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

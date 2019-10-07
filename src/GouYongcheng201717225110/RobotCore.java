package GouYongcheng201717225110;

public class RobotCore extends Robot {
    private String core="              +------------+\n" +
            "              |     +      | \n" +
            "              |    + +     |\n" +
            "              |   + + +    |\n" +
            "              |            |\n" +
            "              +------------+";
    @Override
    public void assemb() {
        System.out.println("机器人核心部件");
        System.out.println(core);
    }

}

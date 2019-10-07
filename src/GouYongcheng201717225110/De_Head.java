package GouYongcheng201717225110;

public class De_Head extends De_RobotParts {
    De_Head(Robot robot) {
        super(robot);
    }

    @Override
    public void assemb() {
        ass_H();
        super.assemb();
    }

    private void ass_H(){
        System.out.println("装上头");
        System.out.println(head);
    }

    String head="                +--------+\n" +
            "                | *    * |\n" +
            "                |   口   |\n" +
            "                +--------+\n" +
            "                   | |";

}

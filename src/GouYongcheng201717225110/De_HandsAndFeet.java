package GouYongcheng201717225110;

public class De_HandsAndFeet extends De_RobotParts {

    De_HandsAndFeet(Robot robot) {
        super(robot);
    }

    @Override
    public void assemb() {
        super.assemb();
        this.ass_HAF();
    }

    private void ass_HAF(){
        System.out.println("װ���ֺͽ�");
        System.out.println(HAF);
    }

    String HAF="              +------------+\n" +
            "            / |     +      | \\\n" +
            "           / /|    + +     |\\ \\\n" +
            "          / / |   + + +    | \\ \\\n" +
            "          ��  |            |  ��\n" +
            "              +------------+\n" +
            "                 | |   | |\n" +
            "                 | |   | |\n" +
            "                 | |   | |\n" +
            "                 | |   | |\n" +
            "                 ��    ��";
}

package GouYongcheng201717225110;

public class De_RobotParts extends Robot {
    private Robot robot;

    De_RobotParts(Robot robot){
        this.robot=robot;
    }

    @Override
    public void assemb() {
        robot.assemb();
    }
}

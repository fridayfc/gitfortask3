package GouYongcheng201717225110;

public class Assemb {
    public static void main(String[] args) {
        Robot Core,part1,part2;
        Core=new RobotCore();
        part1=new De_Head(Core);
        part2=new De_HandsAndFeet(part1);
        part2.assemb();
/*
                +--------+
                | *    * |
                |   口   |
                +--------+
                   | |
              +------------+
            / |     +      | \
           / /|    + +     |\ \
          / / |   + + +    | \ \
          手  |            |  手
              +------------+
                 | |   | |
                 | |   | |
                 | |   | |
                 | |   | |
                 脚    脚

              +------------+
              |     +      |
              |    + +     |
              |   + + +    |
              |            |
              +------------+
 */
    }
}

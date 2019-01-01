package properties1

class Robot {
    var x = 0
    var y = 0

    fun goRight(steps: Int) {
        x += steps
    }

    fun goLeft(steps: Int) {
        x -= steps
        if(x < 0){
            x = 0
        }
    }

    fun goDown(steps: Int) {
        y += steps
    }

    fun goUp(steps: Int) {
        y -= steps
        if(y < 0){
            y = 0
        }
    }

    fun getLocation(): String = "($x,$y)"
}

fun main(args: Array<String>) {
    val robot = Robot()
    println(robot.getLocation())
    robot.goRight(1)
    println(robot.getLocation())
    robot.goDown(2)
    println(robot.getLocation())
}
/* Output:
(0,0)
(1,0)
(1,2)
*/
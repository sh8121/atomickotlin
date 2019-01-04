package constructors1

class Robot(val fieldSize:Int = 100, var x:Int = 0, var y:Int = 0) {

    fun crossBoundary(coordinate: Int) : Int{
        val inBounds = coordinate % fieldSize
        return if(inBounds < 0){
            inBounds + fieldSize
        }
        else{
            inBounds
        }
    }

    fun goRight(steps: Int) {
        x += steps
        x = crossBoundary(x)
    }

    fun goLeft(steps: Int) {
        x -= steps
        x = crossBoundary(x)
    }

    fun goDown(steps: Int) {
        y += steps
        y = crossBoundary(y)
    }

    fun goUp(steps: Int) {
        y -= steps
        y = crossBoundary(y)
    }

    fun getLocation(): String = "($x,$y)"
}

/*
fun main(args: Array<String>) {
    val robot = Robot(10, 1, 1)
    println(robot.getLocation())
    robot.goUp(2)
    println(robot.getLocation())
    robot.goLeft(10)
    println(robot.getLocation())
}
*/
/* Output:
(1,1)
(1,9)
(1,9)
*/
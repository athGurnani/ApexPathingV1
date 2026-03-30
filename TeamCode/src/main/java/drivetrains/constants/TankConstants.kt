package drivetrains.constants

import com.qualcomm.robotcore.hardware.DcMotorSimple

class TankConstants() {
    var leftMotorNames = {"leftDrive"}
        set(value) {

            }
    var rightMotorNames = {"rightDrive"}

    var leftMotorDirection = DcMotorSimple.Direction.REVERSE
    var rightMotorDirection = DcMotorSimple.Direction.FORWARD


}
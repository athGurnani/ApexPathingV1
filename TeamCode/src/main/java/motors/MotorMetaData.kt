package motors

import android.graphics.Path
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorSimple

class MotorMetaData {
    var name : String = "motor"
    var direction : DcMotorSimple.Direction = DcMotorSimple.Direction.FORWARD
    var brakeMode : DcMotor.ZeroPowerBehavior = DcMotor.ZeroPowerBehavior.FLOAT
    var runMode : DcMotor.RunMode = DcMotor.RunMode.STOP_AND_RESET_ENCODER

    constructor(name : String, direction : DcMotorSimple.Direction, brakeMode : DcMotor.ZeroPowerBehavior, runMode: DcMotor.RunMode) {
        this.name = name;
        this.direction = direction
        this.brakeMode = brakeMode
        this.runMode = runMode
    }

    constructor(name : String, direction : DcMotorSimple.Direction, brakeMode : DcMotor.ZeroPowerBehavior) {
        MotorMetaData(name, direction, brakeMode, DcMotor.RunMode.RUN_WITHOUT_ENCODERS)
    }

    constructor(name : String, direction : DcMotorSimple.Direction) {
        MotorMetaData(name, direction, DcMotor.ZeroPowerBehavior.FLOAT)
    }
    constructor(name : String) {
        MotorMetaData(name, DcMotorSimple.Direction.FORWARD)
    }
    constructor() {
        MotorMetaData("motor")
    }
}
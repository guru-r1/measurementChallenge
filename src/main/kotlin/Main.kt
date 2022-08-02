fun main(){
    val m = Measurement()
    m.centimeter = 10.00
    println("${m.centimeter} centimeters is equal to ${m.inches} inches")
    m.inches = 1.00
    println("${m.inches} inches is equal to ${m.centimeter} centimeters")
}

class Measurement {

    //field
    private var _centimeter: Double = 0.0

    //properties
    var centimeter: Double
    get() {
        return this._centimeter
    }
    set(value) {
        this._centimeter = value
    }

    var inches: Double
    get() {
        return (this._centimeter / 2.54)
    }
    set(value) {
        this._centimeter = (value * 2.54)
    }

}
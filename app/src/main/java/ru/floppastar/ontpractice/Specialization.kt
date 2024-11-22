package ru.floppastar.ontpractice

class Specialization {
    var code: String
    var name: String
    var duration: String
    var qualification: String
    var seatsCount: Int

    constructor(_code: String, _name: String, _duration: String,
                _qualification: String, _seatsCount: Int) {
        code = _code
        name = _name
        duration = _duration
        qualification = _qualification
        seatsCount = _seatsCount
    }
}
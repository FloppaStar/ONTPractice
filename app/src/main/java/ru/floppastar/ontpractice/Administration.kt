package ru.floppastar.ontpractice

class Administration {
    var firstName: String
    var secondName: String
    var middleName: String
    var workingPosition: String
    var education: String
    var description: String
    var teaches: String

    constructor(_firstName: String, _secondName: String, _middleName: String,
                _workingPosition: String, _education: String, _desctiption: String, _teaches: String) {
        firstName = _firstName
        secondName = _secondName
        middleName = _middleName
        workingPosition = _workingPosition
        education = _education
        description = _desctiption
        teaches = _teaches
    }
}
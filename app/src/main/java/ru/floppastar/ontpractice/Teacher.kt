package ru.floppastar.ontpractice

class Teacher {
    var firstName: String
    var secondName: String
    var middleName: String
    var description: String
    var education: String
    var teaches: String

    constructor(_firstName: String, _secondName: String, _middleName: String,
        _desctiption: String, _education: String, _teaches: String) {
        firstName = _firstName
        secondName = _secondName
        middleName = _middleName
        description = _desctiption
        education = _education
        teaches = _teaches
    }
}
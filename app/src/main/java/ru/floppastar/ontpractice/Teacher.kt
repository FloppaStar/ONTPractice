package ru.floppastar.ontpractice

class Teacher {
    var firstName: String
    var secondName: String
    var middleName: String
    var specialization: String
    var description: String

    constructor(_firstName: String, _secondName: String, _middleName: String,
        _specialization: String, _desctiption: String) {
        firstName = _firstName
        secondName = _secondName
        middleName = _middleName
        specialization = _specialization
        description = _desctiption
    }
}
package ru.floppastar.ontpractice

class Administration {
    var firstName: String
    var secondName: String
    var middleName: String
    var post: String
    var description: String

    constructor(_firstName: String, _secondName: String, _middleName: String,
                _post: String, _desctiption: String) {
        firstName = _firstName
        secondName = _secondName
        middleName = _middleName
        post = _post
        description = _desctiption
    }
}
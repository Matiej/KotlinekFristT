package inheritance

class Programmer(name: String?, surname: String?, role: String?, salary: Double?, programmingLanguage: String) :
    Employee(name, surname, role, salary) {
    var programmingLanguage: String? = programmingLanguage

}
package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var c = a.toUpperCase()
        if (a.length < b.length) {
            return "NO"
        }
        var i = 0
        for(element in c){
            if (element == b[i])  i++
            if (i == (b.length )) return "YES"
        }
        return "NO"
    }
}

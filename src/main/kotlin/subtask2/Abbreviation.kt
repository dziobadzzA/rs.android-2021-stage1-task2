package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String
    {
        var result = "NO"

        var I = -1
        var index_I = -1
        var length_I = 0

        var bufic = a.toUpperCase().toCharArray()
        var bufic_b = b.toCharArray()

        for (element in bufic)
        {
            I = -1

            for (j in bufic_b.indices) {

                if ( element == bufic_b[j]) {
                    I = j;
                    break;
                }
            }

            if ((I > -1) and (I > index_I)) {

                index_I = I
                length_I++

                if (length_I == b.length)
                     break
            }

        }

        if (length_I == b.length)
            result = "YES"

        return result
    }
}
package subtask3

import kotlin.reflect.KClass
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import kotlin.math.abs

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            String::class -> {
                var result = ""
                for (i in blockA) {
                    if (i is String) {
                        result += i
                    }
                }
                return result
            }
            Int::class -> {
                var sum = 0
                for (i in blockA) {
                    if (i is Int) {
                        sum += i
                    }
                }
                return sum
            }
            else -> {
                var date = LocalDate.now()
                var result =  LocalDate.now()
                var difference : Long
                var check = Long.MAX_VALUE
                for (i in blockA) {
                    if (i is LocalDate){
                        difference = abs(ChronoUnit.DAYS.between(i, date))
                        if (difference < check){
                            check = difference
                            result = i
                        }
                    }
                }
                return result.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
        }
    }
}

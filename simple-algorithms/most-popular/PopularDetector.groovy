Integer mostPopular(def array){
  Integer occurrences = 0
  Integer mostPopular = 0
  array.each{
    if(array.count { it } > occurrences){
      occurrences = array.count { it }
      mostPopular = it
    }
  }
  mostPopular
}


def array = [34,31,34,56,12,35,24,34,69,18]

assert 34 == mostPopular(array)

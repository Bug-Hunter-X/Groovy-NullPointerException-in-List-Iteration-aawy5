```groovy
def myMethod(List<String> list) {
  list?.each { element ->
    println element
  }
}

myMethod(null) // No NullPointerException
myMethod(['a', 'b', 'c']) // Prints a, b, c
```
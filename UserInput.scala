import scala.util.matching.Regex

object UserInput {
  var output = ""
    
  class TextInput{
   
    def add(a: Char) : Unit = {
       output = output.concat(a.toString())
     }
    
    def getValue(): String= {
        output
    }
  }
  
  class NumericInput extends TextInput{
     override def add(a: Char): Unit = {
    if (a < '0' || a > '9') { }
        else
            output = output.concat(a.toString())
   }
  }
  
  def main(args: Array[String]) = {
    
    val input:TextInput= new NumericInput
    input.add('1')
    input.add('a')
    input.add('0')
    println(input.getValue())
  }
  
}
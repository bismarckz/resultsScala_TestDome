class PlayerInventory {
   private var items: Vector[String] = Vector("lumber", "stone", "magic potion")

  def getItems(): Vector[String] = {
    items
  }
    
  def addToInventory(item: String): Unit = {
    items = items :+ item
  }
    
  def dropFromInventory(item: String): Unit = {
    val num = items.indexOf(item)
    if  (num > 0){
    var v1 =items.take(num)
    var v2 =items.drop(num+1)
    items = v1 ++ v2
    }else{
    var v2 =items.drop(num+1)
    items =  v2
      
      }
      
  }
}
object PlayerInventory {   
  def main(args: Array[String]) = {
    var p: PlayerInventory = new PlayerInventory
    println("Agrega")
    p.addToInventory("stone")
     println(p.getItems())
    p.dropFromInventory("magic potion")
    println(p.getItems())
  }
}

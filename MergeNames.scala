object MergeNames {
  def uniqueNames(names1: Vector[String], names2: Vector[String]): Vector[String] = { 
    val L1 =names1.toList
    val L2 =names2.toList
    var L3 = L1 ::: L2

    if(L3.distinct.toVector.isEmpty)
       throw new UnsupportedOperationException("Waiting to be implemented.")
    else
      L3.distinct.toVector
    
}

  def main(args: Array[String]) = {
    val names1 = Vector("Ava", "Emma", "Olivia")
    val names2 = Vector("Olivia", "Sophia", "Emma")
    

    println(uniqueNames(names1, names2))
  }
 }

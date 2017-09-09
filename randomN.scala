object RandomN
{
  def main(args:Array[String]){
  var n = 10
  if(args.length >=1){
   n = args(0).toInt
  }
  var array = new Array[Int](n)
  for(i <- 0 to n-1){
     // println(i)
     array(i) = (math.random()*n).toInt
  }
  var str = array.mkString("<",",",">")
  println(str)
  }
}

object TestProduct
{
  def main(args:Array[String]){
    var str="hello"
    var result = BigInt(1)
    if(args.length >=1)
    {
	str = args(0)
    }
    for(i <- str){
     result *= i.toInt
    }
    println(result)
  }
}

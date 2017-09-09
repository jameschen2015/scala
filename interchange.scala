object Interchange
{
  def main(args:Array[String]){
   val array=Array(1,2,3,4,5,5,8)
   var newA = change(array)
   newA.foreach(println)
   
   println(newA.mkString("<",",",">"));
   println(newA.distinct.mkString("<",",",">"))
  }
  def change(array:Array[Int])={
	for(i <- 0 to array.length-1) yield{
 	var t = 0
 	if(i%2==1){
   		t= array(i-1)
  	}
 	else if(i%2==0 && i!= array.length-1){
  		t= array(i+1)
  	}else{
  		t=array(i)
 	}
 	t;
    }
   }
}

import scala.io.Source
import java.io.PrintWriter

val s = Source.fromFile("README.md","utf-8")
val out = new PrintWriter("test.txt")
var lineIt = s.getLines
for(l <- lineIt)
{
    println(l)

    out.println(l)
}
s.close()
out.close()

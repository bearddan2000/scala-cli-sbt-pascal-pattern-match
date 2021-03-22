object MyApp {
def row(k :Int, i :Int, c :Int): Any = k match {
  case k if(k>i) => return;
  case k if(k==i) =>
    print( s"$c" );
    var a :Int = c * (i-k)/(k+1);
    return row(k+1, i, a);
  case _ =>
    print( s"$c, ");
    var a :Int = c * (i-k)/(k+1);
    return row(k+1, i, a);
}
def col(i :Int, n :Int): Any = i match {
  case 0 => println("1"); return col(i+1, n);
  case i if(i>n) => return;
  case _ => row(0, i, 1); println(); return col(i+1, n);
}
def main(args: Array[String]): Unit = {
  var N:Int = 10;
  println("[INPUT] " + N);
  println("[OUTPUT] ");
  col(0, N);
}
}

/**
  * Created by eli on 11/06/17.
  */
object Hello extends App{

  def times(n:Int)(code: => Unit){
    for (i <- 1  to n ) code
  }

  def printMe():Unit = {println("Hi it's Jenkins integration test")}

  times(3) {printMe()}

}

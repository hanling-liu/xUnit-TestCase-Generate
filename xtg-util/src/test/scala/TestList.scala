/**
 * Created by ZHOUPEIWEN612 on 2015-05-30.
 */
class TestList extends App{

  val list = List(1,2,3,4,5)

  val rets = list.filter(_>6).toString

  println(rets)
}

import com.pinganfu.clps.util.{CstcNotifyProtocol, CstcNotifyBean, TransExtFieldProtocol, TransExtFieldBean}
import TransExtFieldProtocol._
import CstcNotifyProtocol._
import spray.json._
/**
 * Created by ZHOUPEIWEN612 on 2015-05-25.
 */
case class Tbean(name:String,value:Int)
object TestJson extends App{


//  val test = new TransExtFieldBean("1","2","3","4",
//  "5","6","7")
//
//  val str = test.toJson.compactPrint
//  println(str)
//
//  var test2 = new CstcNotifyBean("1","2","3","4","5","6","7","8","9","10","11","12","13","14")
//  val str2 = test2.toJson.compactPrint
//  println(str2)

  val list = List(new Tbean("1",1),new Tbean("2",2),new Tbean("3",3),new Tbean("4",4),new Tbean("5",5))

  val rets = list.filter(_.value>6).head.name

  println(rets)
}

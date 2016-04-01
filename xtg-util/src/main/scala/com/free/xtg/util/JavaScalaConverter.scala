
/**
 * JavaScalaConverter
 */
package com.free.xtg.util

import scala.collection.JavaConversions
import java.util.{List => JavaList}
import java.util.{Map => JavaMap}
import java.math.{BigDecimal => JBigDecimal}
import scala.collection.mutable.Map

/**
 * @author hanling.liu
 *
 */
object JavaScalaConverter {

    implicit def convertJavaList2ScalaList[B <: AnyRef](list: JavaList[B]): List[B] = {

    JavaConversions.asScalaBuffer(list).toList
  }

  implicit def convertScalaList2JavaList[B <: AnyRef](list: List[B]): JavaList[B] = {

    JavaConversions.seqAsJavaList(list)
  }
  
  implicit def convertJavaMap2ScalaMap[B <: AnyRef](map:JavaMap[B,B]):Map[B,B] = {
    
    JavaConversions.mapAsScalaMap(map)
  }

  implicit  def convertScalaMap2JavaMap[B <: AnyRef](map:Map[B,B]):JavaMap[B,B] ={
    JavaConversions.mapAsJavaMap(map)
  }
  
  implicit def convertJavaBigDecimal2ScalaBigDecimal(b:JBigDecimal):BigDecimal = {
    val optB = Option(b)

    optB match {
      case Some(jb) => BigDecimal(jb)
      case None => null
    }
  }

  implicit def convertScalaBigDecimal2JavaBigDecimal(sb:BigDecimal):JBigDecimal ={
    val optB = Option(sb)
    optB match {
      case Some(sb) => sb.bigDecimal
      case None => null
    }
  }
}
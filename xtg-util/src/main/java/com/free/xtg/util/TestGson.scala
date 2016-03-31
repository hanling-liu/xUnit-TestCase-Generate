import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.apache.commons.lang.StringEscapeUtils

import scala.collection.mutable.HashMap

/**
 * Created by ZHOUPEIWEN612 on 2015-06-03.
 */
object TestGson {
  def main(args: Array[String]) {
    val gson = new Gson
    val jsonString = "{\"test1\":\"value-test1\",\"test2\":\"value-test2\"}"
    val e = StringEscapeUtils.unescapeHtml(jsonString)
    println(StringEscapeUtils.unescapeHtml(jsonString))
    val mapType = new TypeToken[HashMap[String, String]] {}.getType
    val map = gson.fromJson(e, mapType).asInstanceOf[HashMap[String, String]]
    println(map.get("test1"))
  }


}

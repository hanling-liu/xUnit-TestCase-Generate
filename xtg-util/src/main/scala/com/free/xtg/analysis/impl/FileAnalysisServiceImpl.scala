package com.free.xtg.analysis.impl

import java.lang.reflect.Method

import com.free.xtg.analysis.FileAnalysisService
import com.free.xtg.domain._
import com.free.xtg.util.JavaScalaConverter._
import scala.collection.mutable.ListBuffer
import scala.reflect.runtime.universe._

/**
  * Created by hanling.liu on 2016/3/31.
  */
class FileAnalysisServiceImpl extends FileAnalysisService{

  val FAIL_TYPE_JAVA = "java"
  val FAIL_TYPE_SCALA = "scala"
  /**
    * 文件分析
    *
    * @param fileBean
    * @return
    */
  override def fileAnalysis(fileBean: InPutFileBean): AnalysisResultBean = {

    if(fileBean.getFileName.endsWith(FAIL_TYPE_JAVA))
      analysisScala(fileBean)

    else if (fileBean.getFileName.endsWith(FAIL_TYPE_SCALA))
      analysisScala(fileBean)

    else
      null

  }

  /**
    * Scala 文件解析
    * @param fileBean
    * @return
    */
  private def analysisScala(fileBean: InPutFileBean):AnalysisResultBean = {
    val result = new AnalysisResultBean
    val classObj = Class.forName(fileBean.getFileName)
    val methods = classObj.getMethods
    val methodList = new ListBuffer[MethodAnalysisBean]
    for (method <- methods){
      if(method.getModifiers <= 1){  //获取公用方法(public)
        val mab = new MethodAnalysisBean
        val methodName = method.getName
        mab.setMethodName(methodName)
        mab.setReturnParamType(method.getGenericReturnType.getTypeName)
        mab.setParamTypeList(getParameterTypes(method))  //获取方法入参列表
        mab.setDependMethodList(getDependMethodList(method))  //获取方法依赖列表
        mab.setClassName(fileBean.getFileName)
        methodList += mab
      }
    }
    result.setMethodList(methodList.toList)
    result
  }

  /**
    * 获取入参类型
    * @param method
    * @return
    */
  private def getParameterTypes(method:Method): List[String] = {
    val paramTypeList = new ListBuffer[String]
    val params = method.getParameterTypes
    if (params.nonEmpty) {
      val paramTypeList = new ListBuffer[String]
      for (param <- params) {
        paramTypeList += param.getName
      }
    }
    paramTypeList.toList
  }

  /**
    * 获取依赖
    * @param method
    * @return
    */
  private def getDependMethodList(method:Method):List[CallMethodBean] = {
    val callMethods = new ListBuffer[CallMethodBean]
    callMethods.toList
  }


}

object FileAnalysisServiceImpl {
  def main(args: Array[String]) {
    val classObje = Class.forName("com.free.xtg.analysis.impl.FileAnalysisServiceImpl")
    val a = classObje.getDeclaredMethods
    for (c <- a) {
      val paramTypes = c.getParameterTypes
      val strTemp = c.getName + "-" + c.getModifiers + "-" + c.getGenericReturnType.getTypeName
      var param = "null"
      for(d <- paramTypes){
        param += d.getName
      }
      println(strTemp + "-" + param)
    }
  }
}

package com.free.xtg.util

import java.io.PrintWriter

import com.free.xtg.util.CControl._

/**
  * Created by hanling.liu on 2016/3/31.
  */
trait FileUtil[F[_]]{
  def writeFile[B](list:F[B],fileName:String,header:String,footer:String,encoding:String)(f:B=>String):Unit

  def readFile[A,B](fileName:String,encoding:String,hasHeader:Boolean)(f1:String=>A)(f2:String=>B):(A,F[B])
}


object FileUtil{

  implicit val listFileUtil:FileUtil[List] = new FileUtil[List]{
    override def writeFile[B](list: List[B], fileName: String,header:String,footer:String,encoding:String)(f:B=>String): Unit = {

      using(new PrintWriter(fileName,encoding)){printer =>
        if(header!=null && header.length > 0)printer.write(header + "\r\n")
        list.foreach(b=>printer.write(f(b) + "\r\n"))
        if(footer!=null && footer.length > 0)printer.write(footer + "\r\n")
      }
    }

    override def readFile[A, B](fileName: String,encoding:String="UTF-8",hasHeader:Boolean)(f1: (String) => A)(f2: (String) => B): (A, List[B]) = {
      using(io.Source.fromFile(fileName,encoding)){source =>{
        val lines = source.getLines().toList
        if(hasHeader)(f1(lines.head),lines.drop(1).map(f2))
        else(f1(null),lines.map(f2))
      }
      }
    }
  }
}

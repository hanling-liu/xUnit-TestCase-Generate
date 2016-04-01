package com.free.xtg.util

/**
  * Created by hanling.liu on 2016/3/31.
  */
object CControl {
  def using[A <: {def close() : Unit}, B](resource: A)(f: A => B): B =
    try {
      f(resource)
    } finally {
      resource.close()
    }
}

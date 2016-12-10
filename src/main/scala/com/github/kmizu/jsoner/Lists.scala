package com.github.kmizu.jsoner

/**
  * Created by Mizushima on 2016/12/10.
  */
object Lists {
  def cons[A](hd: A, tl: List[A]): List[A] = hd :: tl
  def one[A](hd: A): List[A] = hd :: Nil
}

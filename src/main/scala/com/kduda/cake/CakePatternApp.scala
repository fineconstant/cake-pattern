package com.kduda.cake

import com.kduda.cake.common.User

object CakePatternApp {
  def main(args: Array[String]): Unit = {
    ApplicationContext.userService
      .save(User("Summer"))

    ApplicationContext.userService
      .findAll
      .foreach(println)
  }
}

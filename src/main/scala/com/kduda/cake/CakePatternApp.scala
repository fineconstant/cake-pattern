package com.kduda.cake
import com.kduda.cake.model.User

object CakePatternApp {
  def main(args: Array[String]): Unit = {
    ApplicationContext.userService
    .save(User("Bob"))

    ApplicationContext.userService
      .findAll
      .foreach(println)
  }
}

package com.kduda.cake.service.api

import com.kduda.cake.model.User

trait UserServiceComponent {
  def userService: UserService

  trait UserService {
    def findAll: List[User]
    def save(user: User)
  }
}
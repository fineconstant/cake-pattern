package com.kduda.cake.service
import com.kduda.cake.common.User

trait UserServiceComponent {
  def userService: UserService

  trait UserService {
    def findAll: List[User]

    def save(user: User)
  }

}

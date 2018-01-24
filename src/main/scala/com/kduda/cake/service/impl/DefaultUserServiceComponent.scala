package com.kduda.cake.service.impl

import com.kduda.cake.model.User
import com.kduda.cake.repository.api.UserRepositoryComponent
import com.kduda.cake.service.api.UserServiceComponent

trait DefaultUserServiceComponent extends UserServiceComponent {
  this: UserRepositoryComponent =>

  def userService = new DefaultUserService

  class DefaultUserService extends UserService {
    override def findAll: List[User] = userLocator.findAll

    override def save(user: User): Unit = userUpdater.save(user)
  }

}

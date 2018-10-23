package com.kduda.cake.service.default

import com.kduda.cake.common.User
import com.kduda.cake.repository.UserRepositoryComponent
import com.kduda.cake.service.UserServiceComponent
trait DefaultUserServiceComponent extends UserServiceComponent {
  this: UserRepositoryComponent =>

  def userService = new DefaultUserService

  class DefaultUserService extends UserService {
    override def findAll: List[User] = userLocator.findAll

    override def save(user: User): Unit = userUpdater.save(user)
  }

}

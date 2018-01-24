package com.kduda.cake.repository.impl

import com.kduda.cake.model.User
import com.kduda.cake.repository.api.UserRepositoryComponent

trait UserRepositoryJPAComponent extends UserRepositoryComponent {
  // TODO: use some persistence mechanism
  var users: List[User]

  def userLocator: UserLocator = new UserLocatorJpa

  def userUpdater: UserUpdater = new UserUpdaterJpa

  class UserLocatorJpa extends UserLocator {
    override def findAll: List[User] = users
  }

  class UserUpdaterJpa extends UserUpdater {
    override def save(user: User): Unit = users = users :+ user
  }

}

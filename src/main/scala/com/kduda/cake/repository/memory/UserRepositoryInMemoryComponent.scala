package com.kduda.cake.repository.memory

import com.kduda.cake.common.User
import com.kduda.cake.repository.UserRepositoryComponent

trait UserRepositoryInMemoryComponent extends UserRepositoryComponent {
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

package com.kduda.cake.repository.memory

import com.kduda.cake.common.User
import com.kduda.cake.repository.UserRepositoryComponent

trait UserRepositoryInMemoryComponent extends UserRepositoryComponent {
  var usersManager: List[User]

  def userLocator = new UserLocatorJpa(usersManager)

  def userUpdater = new UserUpdaterJpa(usersManager)

  class UserLocatorJpa(entityManager: List[User]) extends UserLocator {
    override def findAll: List[User] = entityManager
  }

  class UserUpdaterJpa(entityManager: List[User]) extends UserUpdater {
    override def save(user: User): Unit = usersManager = entityManager :+ user
  }

}

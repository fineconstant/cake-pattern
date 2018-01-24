package com.kduda.cake.repository.api

import com.kduda.cake.model.User

trait UserRepositoryComponent {
  def userLocator: UserLocator

  def userUpdater: UserUpdater

  trait UserLocator {
    def findAll: List[User]
  }

  trait UserUpdater {
    def save(user: User)
  }

}
package com.kduda.cake

import com.kduda.cake.common.User
import com.kduda.cake.repository.memory.UserRepositoryInMemoryComponent
import com.kduda.cake.service.UserServiceComponent
import com.kduda.cake.service.default.DefaultUserServiceComponent

object ApplicationContext {

  /**
    * We first define and instantiate a UserServiceComponent, mixing in the appropriate repository implementation,
    * as required by the self-type annotation described earlier.
    *
    * We then provide the UserRepositoryJPAComponent implementation for instantiating the EntityManager.
    *
    * Finally we define a userService val for accessing the service methods.
    */
  val userServiceComponent: UserServiceComponent =
    new DefaultUserServiceComponent with UserRepositoryInMemoryComponent {
      override var usersManager: List[User] = List(User("Rick"), User("Morty"))
    }

  val userService: UserServiceComponent#UserService = userServiceComponent.userService

}

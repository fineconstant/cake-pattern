package com.kduda.cake

import com.kduda.cake.common.User
import com.kduda.cake.repository.jpa.UserRepositoryJPAComponent
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
    new DefaultUserServiceComponent with UserRepositoryJPAComponent {
      override var users: List[User] = List(User("John"), User("Marty"))
    }

  val userService = userServiceComponent.userService

}

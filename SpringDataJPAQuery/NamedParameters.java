//a way of passing method parameters to query using named parameters
//use @Param

//JPQL Example
@Query("SELECT u FROM User u WHERE u.status = :status and u.name = :name")
User findUserByStatusAndNameNamedParams(
  @Param("status") Integer status, 
  @Param("name") String name);



//method parameters can have different names: JPQL Example
@Query("SELECT u FROM User u WHERE u.status = :status and u.name = :name")
User findUserByUserStatusAndUserName(@Param("status") Integer userStatus, 
  @Param("name") String userName);




//Native example:named parameters
@Query(value = "SELECT * FROM Users u WHERE u.status = :status and u.name = :name", 
  nativeQuery = true)
User findUserByStatusAndNameNamedParamsNative(
  @Param("status") Integer status, @Param("name") String name);
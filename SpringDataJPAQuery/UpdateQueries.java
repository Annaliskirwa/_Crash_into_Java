//use @modifying


//JPQL
//uses update instead of select
@Modifying
@Query("update User u set u.status = :status where u.name = :name")
int updateUserSetStatusForName(@Param("status") Integer status, 
  @Param("name") String name);

  //Native
@Modifying
@Query(value = "update Users u set u.status = ? where u.name = ?", 
  nativeQuery = true)
int updateUserSetStatusForNameNative(Integer status, String name);
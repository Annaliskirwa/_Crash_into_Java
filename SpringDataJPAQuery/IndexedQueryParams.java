//1. Indexed parameters

//index parameters in JPQL
@Query("SELECT u FROM User u WHERE u.status = ?1")
User findUserByStatus(Integer status);

@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")
User findUserByStatusAndName(Integer status, String name);

//indexed parameters in Native
@Query(
  value = "SELECT * FROM Users u WHERE u.status = ?1", 
  nativeQuery = true)
User findUserByStatusNative(Integer status);
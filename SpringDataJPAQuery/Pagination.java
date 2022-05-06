//JPQL

@Query(value = "SELECT u FROM User u ORDER BY id") Page<User> findAllUsersWithPagination(Pageable pageable);

//Native Query: declare an additional attribute called countQuery

@Query(
  value = "SELECT * FROM Users ORDER BY id", 
  countQuery = "SELECT count(*) FROM Users", 
  nativeQuery = true)
Page<User> findAllUsersWithPagination(Pageable pageable);
//where clause of our JPQL or SQL query contains the IN (or NOT IN) keyword:

@Query(value = "SELECT u FROM User u WHERE u.name IN :names")
List<User> findUserByNameList(@Param("names") Collection<String> names);
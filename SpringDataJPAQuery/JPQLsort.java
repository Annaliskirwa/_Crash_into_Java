//spring data handles the sorting

@Query(value = "SELECT u FROM User u") List<User> findAllUsers(Sort sort);
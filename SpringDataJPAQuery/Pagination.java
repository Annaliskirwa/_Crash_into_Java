//JPQL

@Query(value = "SELECT u FROM User u ORDER BY id") Page<User> findAllUsersWithPagination(Pageable pageable);
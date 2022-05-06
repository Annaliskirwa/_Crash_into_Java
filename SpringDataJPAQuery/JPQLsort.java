//spring data handles the sorting

@Query(value = "SELECT u FROM User u") List<User> findAllUsers(Sort sort);

//sorting by name
userRepository.findAllUsers(Sort.by("name"));


//sorting byu the length of the name
userRepository.findAllUsers(JpaSort.unsafe("LENGTH(name)"));
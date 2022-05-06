@@Query("SELECT u FROM User u WHERE u.status = 1")
Collection<User> findAllActiveUsers();
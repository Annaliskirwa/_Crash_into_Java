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

//insert operation into the database
//insert is not part of jpa
//use native query
@Modifying
@Query(
  value = 
    "insert into Users (name, age, email, status) values (:name, :age, :email, :status)",
  nativeQuery = true)
void insertUser(@Param("name") String name, @Param("age") Integer age, 
  @Param("status") Integer status, @Param("email") String email);
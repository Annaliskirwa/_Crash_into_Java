//@Bean annotations are used at the method level and indicate that a method produces a bean that is to be managed by Spring container.

@Bean
Public BeanExample beanExample(){
    return new BeanExample(),
}
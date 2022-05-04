// @Configuration annotation indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime

@Configuration
public class business{
    @BeanBus engine(){
        return new Bus();
    }
}
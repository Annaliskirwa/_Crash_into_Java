

/**
 * @SpringBootApplication

does the component scan
consists of @Configuration, @ComponentScan, @EnableAutoConfiguration

 */

 /**
  * @EnableAutoConfiguration
  instructs springboot to start adding beans
  */

  /**
   * @ComponentScan
   * scans packages of beans
   * specifies base packages
   */

   /**
    * @Required
    applied to bean setter methods
    indicates that the required property must be filled at configuration time
    */

    /**
     * @Qualifier
     * used with @autowired
     *  used when more control is required over the dependency injection process
     */

     /**
      * @CookieValue
      used at the method parameter level as an argument of the request mapping method
      */

      /**
       * @Lazy
       * used in component and configuration classes
       * used when a bean is to be initialized lazily.
       */
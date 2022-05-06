//can only use object properties to define our sort

userRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
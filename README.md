Design Patterns - This Page is WIP
===========================
Repository which I am practising various design patterns using java.

## Builder Design Pattern
 - This is used to create objects, some resources recommend using this pattern for creating large objects only i.e which have many fields. 
 - Using this pattern helps creating objects with optional parameters. Else we have to define separate constructors based on the parameters passed. 
 - we can also perform validations inside the builder class itself. 
 - This helps in achieving immutability. Since we do not provide any setters and mark the class as final.
 - immutable objects are thread safe. 
 - For use with Hibernate, the class's constructor should be made proctected. Need to test this.
 
#### Resources
 - https://app.pluralsight.com/library/courses/design-patterns-java-creational/table-of-contents
 - https://dzone.com/articles/immutability-with-builder-design-pattern
 - Builder patter in hibernate entity, need to try this (https://stackoverflow.com/questions/8111461/how-can-you-use-builder-pattern-for-entities-with-jpa) 

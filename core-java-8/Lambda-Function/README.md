#Lambda - Function

##The java.util.function Package

Of course, Predicate is not the only functional interface provided with Java SE 8. A number of standard interfaces are designed as a starter set of developers.

+ Predicate : A property of the object passed as argument
+ Consumer : An action to be perfomed with the object passed as argument
+ Function : Transform a T to a U
+ Supplier : Provide an instance of a T ( such as a Factory )
+ UnaryOperator : A unary operator form T -> T
+ BinaryOperator : A binary operator from (T,T) -> T

In addition , many of these interfaces also have primitive versions. This should give you a great starting point for your lambda expressions.

## The Function Interface

The Function interface has only one method 'apply' with the following signature:
'''java 
public R apply(T t){ }
'''
It takes a generic class T and returns a generic class R. For this example , pass the Person class and return a String. 

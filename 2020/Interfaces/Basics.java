// Interface: service requirement specification
// interface define the set of services what is expecting.
// Eg. ATM

// Interface is considered as 100% pure abstract class.

// Declaration and Implementation Of an interfaces

// Note: Whenever we are implementing an interface compulsory for every method
// of that interface we should provide implementation otherwise we have to
// declare class as abstract in that case child class is responsible to provide
// implementation for remaining methods.

// Note: Whenever we are implementing an interface method compulsory it should
// be declared as public otherwise we will get compile time error.

interface Interf {
  void methodOne();// methodOne Declaration

  void methodTwo();// methodTwo Declaration
}

// subclass of interf must provide definition for all methods otherwise it must
// be abstrct
abstract class ServiceProvider implements Interf {
  public void methodOne() {
    // methodOnce Definition
  }
}

// If abstract class that implements an interface and does not provide defintion
// for all methods, then child class of abstract class must provide the
// definition.
class SubServiceProvider extends ServiceProvider {
  public void methodTwo() {

  }
}

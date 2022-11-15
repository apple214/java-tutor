public class myProgram {
  public static void main(String[] args){ //method
    //a string array called args, string is a parameter
    System.out.println("Hello World!" + args[0]);
    //System - class; out - member; println - member of out
    //args - argument

    myProgram x = new myProgram();
    x.others();
  }
  public String x = new String(); //property

  private void others(){
    System.out.println("Hello others!");
  }
}


// this is comment - won't run
// class - contains everything - has members (methods & properties)
// methods - do things
// properties - store things (value)

// arguments - what you pass to a method - part of the colling of a method
// parameter - variable to store arguments - part of the definition of a method

// access modifier (public, private) - decide who have access to it
// static - won't need instance of class - special thing for object oriented programming
// objects - instances of a class

// {}curly braces - container

// src folder - source files
// bin folder - object files

// literals - the value
// variables - store some value
// expression - evaluates to a value
// operator - work on operands to produce a value

<p>1. Write a method that overloads the talk method by taking in a name and printing “Hello” with that name.</p>


    public class Test1
    {
        public static void talk()
        {
              System.out.println("hello there!");
        }
    
        public static // FINISH THE METHOD HERE //
    
        public static void main(String[] args)
        {
              talk("Matthew");
        }
    }
    

----------------------------------------------------------------------

<p>2. Create an interface named Test that has a void talk method and void walk method.</p>


---------------------------------------------------------------------------
<p>3. Edit this code so the class Beagle is a subclass of the Dog class. When you run the code it should print “woof!” and then “arf arf”</p>

    public class Dog {

        public void speak() {
            System.out.println("woof!");
        }
    
        public static void main(String[] args) {
            Dog d = new Dog();
            d.speak();
            Dog b = new Beagle();
            b.speak();
        }
    }
    
    class Beagle {
        public void speak() {
            System.out.println("arf arf");
        }
    }
----------------------------------------------------------------------------

<p>4. Add an equals method to this class that returns true if the current Dog and passed Dog have the same name. The code should print false twice then true twice.</p>
   
    public class Dog {

        private String name;
    
        public Dog(String name) {
            this.name = name;
        }
    
        public boolean equals(Object other) {
            // ADD CODE HERE
        }
    
        public static void main(String[] args) {
            Dog d1 = new Dog("Rufus");
            Dog d2 = new Dog("Sally");
            Dog d3 = new Dog("Rufus");
            Dog d4 = d3;
            System.out.println(d1.equals(d2));
            System.out.println(d2.equals(d3));
            System.out.println(d1.equals(d3));
            System.out.println(d3.equals(d4));
        }
    }

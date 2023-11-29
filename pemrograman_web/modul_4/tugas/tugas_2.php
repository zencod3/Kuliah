<?php

namespace MyApp;

trait Loggable {
    public function log($message) {
        echo "[Log] $message\n";
    }
}

abstract class Animal {

    
    protected $name;
    protected $sound;

    abstract public function makeSound();
    abstract public function move();

    public function __construct($name, $sound) {
        $this->name = $name;
        $this->sound = $sound;
    }
    
    public function introduce() {
        return "I am $this->name!";
    }
}

class Dog extends Animal {
    use Loggable; 

    public function __construct($name) {
        parent::__construct($name, 'Bark');
    }

    public function makeSound() {
        $this->log("Dog is barking: $this->sound");
        return $this->sound;
    }

    public function move() {
        $this->log("Dog is walking.");
    }
}

class Cat extends Animal {
    use Loggable; 

    public function __construct($name) {
        parent::__construct($name, 'Meow');
    }

    public function makeSound() {
        $this->log("Cat is meowing: $this->sound");
        return $this->sound;
    }

    public function move() {
        $this->log("Cat is jumping.");
    }
}

$dog = new Dog("Buddy");
$cat = new Cat("Whiskers");

echo $dog->introduce() . "\n";
echo $dog->makeSound() . "\n";
echo $dog->move() . "\n";

echo $cat->introduce() . "\n";
echo $cat->makeSound() . "\n";
echo $cat->move() . "\n";

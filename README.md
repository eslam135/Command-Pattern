
# Command Pattern

## What is the Command Pattern?

### The Command Pattern is a behavioral design pattern that decouples the sender of a request from the object that performs the request. It involves encapsulating each request as an object, allowing you to parameterize clients with different requests, queue or log requests, and support undoable operations.

### In the Spaceship example, we have a Spaceship class that can have weapons and defenses added or removed from it. We want to implement undo and redo functionality for these actions, so we use the Command Pattern to encapsulate each action as a command object.

### The SpaceCommand interface declares methods for executing and undoing a command. Each concrete command class implements these methods to define the behavior of the command. For example, the AddWeaponCommand class implements execute() to add a weapon to the spaceship, and unexecute() to remove the weapon.

### The client code interacts with the spaceship through the command objects, without knowing the specific classes of the objects being executed. This makes the code more flexible and modular since we can easily add or remove commands without affecting the client code.

## Why is it used?

### The Command Pattern is used to decouple the sender of a request from the object that performs the request, allowing for greater flexibility, extensibility, and modularity in the code. It also supports undoable operations, allowing clients to undo and redo actions as needed.

## How does it work?

1. Define the Command interface: Create an interface that declares methods for executing and undoing a command. In our example, we would create a Command interface with methods like execute() and unexecute().

2. Implement the concrete command classes: Create separate classes for each command to be executed, implementing the Command interface. Each concrete command class will provide its own implementation of the execute() and unexecute() methods. For example, the AddWeaponCommand class would implement execute() to add a weapon to the spaceship, and unexecute() to remove the weapon.

3. Create the invoker object: Create an invoker object that will execute the commands. In our example, we could create a CommandManager class that will manage the commands and execute them as needed.

4. Create and add the command objects: Create the command objects and add them to the invoker object. In our example, we could create an AddWeaponCommand object to add a weapon to the spaceship, and add it to the CommandManager.

5. Execute the commands: Execute the commands as needed by calling the execute() method on the invoker object. In our example, we could call the execute() method on the CommandManager to add the weapon to the spaceship.

6. Undo and redo operations: Support undo and redo operations by calling the unexecute() method on the command objects. In our example, we could call the unexecute() method on the AddWeaponCommand object to remove the weapon from the spaceship.


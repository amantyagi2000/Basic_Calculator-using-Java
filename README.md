# Basic_Calculator-using-JavaSure! Here's an overview of the code:

The code consists of three classes: `InputHandler`, `Calculator`, and `Basic_Calculator`.

The `InputHandler` class handles user input. It has two methods:
- `getValidIntegerInput(String prompt)`: Prompts the user with the provided message and reads an integer input. It repeats the prompt until a valid integer is entered.
- `getIntegerInputInRange(String prompt, int min, int max)`: Prompts the user with the provided message and reads an integer input within the specified range. It uses the `getValidIntegerInput` method to validate the input.

The `Calculator` class contains static methods for arithmetic operations:
- `addition(int a, int b)`: Performs addition and returns the result.
- `subtraction(int a, int b)`: Performs subtraction and returns the result.
- `multiplication(int a, int b)`: Performs multiplication and returns the result.
- `division(int a, int b)`: Performs division and returns the result.

The `Basic_Calculator` class is the main class. It creates an instance of `InputHandler` and `Calculator`. It prompts the user for two numbers using the `getValidIntegerInput` method. Then, it enters a loop where it prompts the user for an operation choice using the `getIntegerInputInRange` method. Based on the choice, it performs the corresponding operation using the `Calculator` class and displays the result. The loop continues until the user chooses to exit by entering `0`.

Overall, the code separates the concerns of handling user input, performing calculations, and managing the main program flow. It promotes modularity and reusability by encapsulating functionality into separate classes.

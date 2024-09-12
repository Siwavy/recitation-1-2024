<div style="text-align:center;"><img src="src/main/resources/pemacs-logo.png"></div>

# Elements of Computer Programming II (CSCI-121)

## Recitation 1 - Input, Output, Variables, Casting, and More

### Learning Outcomes

By the end of this activity, a student should be able to:

1.	Use type casting.
3.	Using Java operations and expressions to make a calculation.
4.	Use parameters to pass information to methods.
6. Create a static method.

## ATM Dispenser

Consider the following class,

```java
public class ATM
{
	/**
     * prints amount to dispense in twenties, tens, fives, 
     * ones, quarters, dimes, nickels, and pennies.
     * 
     * @param amount The amount in dollars.
     */
    public static void dispense(double amount)
    {
        // TODO: replace this line with your code 
    }
    
    // DO NOT TOUCH THE CODE BELOW THIS LINE
    public static void main(String [] arg) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter amount:");
        double amount = scn.nextDouble();
        dispense(amount);
    }
}
```

Implement the method `dispense` so that it prints the amount to dispense in twenties, tens, fives, ones, quarters, dimes, nickels, and pennies. 

The output should be formatted as follows: 

```
<amount> contains: 
   <num> in $20
   <num> in $10
   <num> in $5
   <num> in $1
   <num> in 25¢
   <num> in 10¢ 
   <num> in 5¢ 
   <num> in 1¢
```
Requirements: The lines containing `<num>` should be tabbed in. The <num> should be replaced by the results of your calculation. `amount` should be replaced by the value of the parameter.

For example: 

```
ATM.dispense(77.93);

```

Results in,

```
77.87 contains:
    3 in $20
    1 in $10
    1 in $5
    2 in $1
    3 in 25¢
    1 in 10¢
    0 in 5¢
    2 in 1¢
```


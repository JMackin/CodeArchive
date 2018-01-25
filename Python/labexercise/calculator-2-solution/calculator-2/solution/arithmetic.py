def add(num1, num2):
    """Returns the sum of the two input integers"""

    return num1 + num2


def subtract(num1, num2):
    """Returns the second number subtracted from the first"""

    return num1 - num2


def multiply(num1, num2):
    """Multiplies the two inputs together"""

    return num1 * num2


def divide(num1, num2):
    """Divides the first input by the second, returning a floating point"""

    # Need to turn at least argument to float for division to
    # not be integer division

    return float(num1) / float(num2)


def square(num1):
    """Returns the square of the input"""

    # Needs only one argument

    return num1 * num1


def cube(num1):
    """Returns the cube of the input"""

    # Needs only one argument

    return num1 * num1 * num1


def power(num1, num2):
    """Raises the first integer to the power of the second integer and returns the value"""

    return num1 ** num2  # ** = exponent operator


def mod(num1, num2):
    """Returns the remainder when the first integer is divided by the second integer."""

    return num1 % num2

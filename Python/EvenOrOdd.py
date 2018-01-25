def evenodd(n):
    """given a number n, return either even or odd."""
    x = n % 2
    if x == 0:
        print("even")
    else:
        print("odd")
    return 0

evenodd(100)
def evenodd(n):
    """given a number n, return either even or odd."""
    x = n % 2
    if x == 0:
        return("even")
    else:
        return("odd")
    
def evenodd_list(lst):
    """given a number list replaces all even numbers w/ 'even' and all odds w/ 'odd' """
    numlist = []
    for i in lst:
        numlist.append(evenodd(i))
    return numlist
        
alist = [-7, 4, 8, 9]
print(evenodd_list(alist))


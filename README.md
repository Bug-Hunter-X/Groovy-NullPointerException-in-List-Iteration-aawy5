# Groovy NullPointerException in List Iteration

This repository demonstrates a common NullPointerException in Groovy when iterating over a List that might be null.  The provided solution showcases how to handle null values gracefully using Groovy's safe navigation operator.

## Bug

The `myMethod` function iterates over a list of strings and prints each element.  However, if a null list is passed to the function, a `NullPointerException` occurs because the `each` method cannot be called on `null`.

## Solution

The solution uses the safe navigation operator (`?.`) to check for null before attempting to iterate.  This ensures that the `each` method is only called if the list is not null.
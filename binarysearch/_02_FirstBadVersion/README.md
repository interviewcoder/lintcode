### Find Bad Version (find first "..." element in sorted array)

To make life easier, we can consider the very easy situation, only one number exists.

```java
/**
 ********************************************************************
 * case I  : left & right             right    left
                  |                     |        |
          index   0          ===>      -1        0                
          isBad  true                 (null)    true
    expect = 1 => return left + 1  (return the order not the index of bad version)        
 ********************************************************************
 * case II : left & right              right    left
                  |                     |        |
          index   0          ===>       0        1                
          isBad  false                false    (null)
    expect = 2 => return left + 1 (return the order not the index of bad version)
 ********************************************************************    
 * Summary: return left        
 */
 
```
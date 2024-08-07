### -------------Arrays----------------

# array objects are in the heap memory
# heap memeory is not continues (it depends on the jvm)
# array memory is allocated at runtime(dynamic memory allocation)
# null -> it is special literal it can be only in non primitive datatypes
# arrays is mutable in java

# 2d array ----
# 2d array is array of arrays
# in 2d array it is necessory to give row numbers and columns no. is not necessory

#--------Array list----------
# in the array list if we fix the size then also we can add as many items we want in the array list
# internally working of arraylist
    - it is actually fixed size of arraylist
    - but when the array is filled the more the 50% of size then it will create the new Arraylist of double size
    - then it copy all the previous item in the new arraylist and continue adding more items and so long
    - and deleted the previous arraylist 
    - thats how arraylist take as many items we add

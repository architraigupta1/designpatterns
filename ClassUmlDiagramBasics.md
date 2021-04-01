# UML Diagrams Basics

- Visibility is shown by using a ```-, ~, #, +```
```
'-' : Private
'~' : Default
'#' : Protected
+ : Public 
``` 
- Attributes come in the first half followed by behaviours (functions) in the second half
```
-name: String
-age: Int
-gender: Smallint
-active: Boolean
------------------
+getName(): String
+getAge(): Int
+getInroduction(phrase1: String, phase2: String): String
```

- The data type of attributes can be an Object/List.
    1.  Fixed size array: [1..10]
    2. Unknown number: [*]
    3. {unique}, {notUnique}, {ordered}, {readOnly}
    4. static attributes are shown with an underline (below numOfDogs is a static var)
```
-favouriteFood: Food[1..10]
-friends: Friend[*]{unique}
-owners: Owner[*]{ordered}
-favNum: int{readOnly}
-numOfDogs: int
________________ 
```

- Inheritance is shown by a solid arrow from child to parent. 
Example: An arrow from Dog --> Animal
- Composition is shown by an arrow from parent object to the object which is
included in the parent. Example: An arrow from Employee --> Address
- Abstract class names and abstract method names are shown in italics. Rest all other rules apply.
- Interfaces are shown like classes but with a "<<interface>>" tag.
- Relationship between interfaces & classes is shown in a similar way to inheritance except that 
a dashed arrow is used. 
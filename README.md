## API Endpoints
Base URL: http://localhost:8080/axolotls


### all (GET)
http://localhost:8080/axolotls/all
Gets a list of all Axolotls in the database.

#### Response - A JSON array of Axolotl objects:

 ```
[
  {
    "id": 1,
    "name": "Axie",
    "description": "A cute axolotl",
    "color": "pink",
    "age": 2,
    "activeDate": "2024-03-20"
  },
  {
    "id": 2,
    "name": "Lumi",
    "description": "A glowing axolotl",
    "color": "blue",
    "age": 3,
    "activeDate": "2024-02-15"
  }
]
 ```
### Id (GET)
http://localhost:8080/axolotls/{id}
Ex: http://localhost:8080/axolotls/1
Gets an individual Axolotl by its ID.

#### Response - A single Axolotl:

```
{
  "id": 1,
  "name": "Axie",
  "description": "A cute axolotl",
  "color": "pink",
  "age": 2,
  "activeDate": "2024-03-20"
}
```

### name (GET)
http://localhost:8080/axolotls/search?name={name} 
Ex: http://localhost:8080/axolotls/search?name=Lumi 
Gets a list of Axolotls with a name that contains the given string.

#### Response - A JSON array of Axolotl objects:

```
[
  {
    "id": 2,
    "name": "Lumi",
    "description": "A glowing axolotl",
    "color": "blue",
    "age": 3,
    "activeDate": "2024-02-15"
  }
]
```

### color (GET)
http://localhost:8080/api/axolotls/category?color={color}
Ex: http://localhost:8080/api/axolotls/category?color=pink
Gets a list of Axolotls that have the color 

### Response - A JSON array of Axolotl objects:
```
[
  {
    "id": 1,
    "name": "Axie",
    "description": "A cute axolotl",
    "color": "pink",
    "age": 2,
    "activeDate": "2024-03-20"
  }
]
```



### Add a New Axolotl (POST)
http://localhost:8080/api/axolotls
Creates a new Axolotl

### Request Body
```
{
  "name": "New Axolotl",
  "description": "A rare axolotl",
  "color": "yellow",
  "age": 1,
  "activeDate": "2025-01-10"
}
```

### Response - The updated list of Axolotls
```
[
  {
    "id": 1,
    "name": "Axie",
    "description": "A cute axolotl",
    "color": "pink",
    "age": 2,
    "activeDate": "2024-03-20"
  },
  {
    "id": 2,
    "name": "Lumi",
    "description": "A glowing axolotl",
    "color": "blue",
    "age": 3,
    "activeDate": "2024-02-15"
  },
  {
    "id": 3,
    "name": "New Axolotl",
    "description": "A rare axolotl",
    "color": "yellow",
    "age": 1,
    "activeDate": "2025-01-10"
  }
]
```

### Add an Axolotl (PUT)
http://localhost:8080/api/axolotls/{id}
Ex: http://localhost:8080/api/axolotls/1

### Request Body
```
{
  "name": "Updated Axolotl",
  "description": "An even cuter axolotl",
  "color": "purple",
  "age": 4,
  "activeDate": "2025-02-15"
}
```

### Response - The updated list of Axolotls:
```
{
  "id": 1,
  "name": "Updated Axolotl",
  "description": "An even cuter axolotl",
  "color": "purple",
  "age": 4,
  "activeDate": "2025-02-15"
}
```

### Delete an Axolotl (DELETE)
http://localhost:8080/api/axolotls/{id}
Ex: http://localhost:8080/api/axolotls/1

### Response - The updated list of Axolotls:
```
[
  {
    "id": 2,
    "name": "Lumi",
    "description": "A glowing axolotl",
    "color": "blue",
    "age": 3,
    "activeDate": "2024-02-15"
  },
  {
    "id": 3,
    "name": "New Axolotl",
    "description": "A rare axolotl",
    "color": "yellow",
    "age": 1,
    "activeDate": "2025-01-10"
  }
]
```















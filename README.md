# StarWarsApiTestFramework
A framwork to test the Star wars api at Swapi.dev


## Base DTO
All core endpoints can be accessed through the "Base DTO"

### Setup:
Instantiate the base dto tests with:


    private static BaseDTO dto;
    private static int statusCode;
    private static int page = 1;

    @BeforeAll
    static void init() {
        dto = Injector.injectPeopleDTO(ConnectionManager
                        .getConnection("starships"));
        statusCode = ConnectionManager.getStatusCode();

    }

Different base endpoints can be accessed by changing the key in "getConnection"
Different pages can be accessed by adding "page" and the variable page as additional keys.

    private static int page = 2;
    @BeforeAll
    static void init() {
        dto = Injector.injectPeopleDTO(ConnectionManager.getConnection("starships", "page", page));
        statusCode = ConnectionManager.getStatusCode();

    }

--------------------------------------------------
## Individual endpoints

### Setup: 

Individual endpoints can be accessed by using the respective injector and 
calling the getConnection method with the corresponding key and a value for the
endpoint you are looking for:

    private static PeopleDTO peopleDTO;
    private static int statusCode;

    @BeforeAll
    static void init() {
    peopleDTO = Injector.injectPeopleWithNDTO(ConnectionManager.getConnection("people", 3));
    statusCode = ConnectionManager.getStatusCode();
    }
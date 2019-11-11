//package example.university.api;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

//Probably missing some import statements here

@RunWith(JMockit.class)
@SpringBootTest
public class BuildingControllerTest {

    @Tested(availableDuringSetup = true)
    @Injectable
    private UserDomainController testuserDomainController;

    //@Injectable
    //private IBuildingService building_service;
    //a service layer

    privare MockMvc mock_mvc;

    private ObjectMapper obj_mapper;

    @Before
    public void init() {
        obj_mapper = new ObjectMapper();
        mock_mvc = MockMvcBuilders.standaloneSetup(building_controller).build();
    }

    @Test
    public void testSaveUser(){
        Set<RestaurantDomain> testRestaurantDomain = new HashSet<>();
        //(IBuilding)
        testUserDomainCOntroller = new UserDomain(1, "jdawg@gmail.com", "password", "jDawg", "John", "Dawson", testRestaurantDomain);

        testUserDomainController.createNewBuilding();

        new Expectations() {{
            testUserDomainController.addUser(testuserDomainController);
        }};

        try{
            mock_mvc.perform()
        } catch(exception e) {
            e.printStackTrace();
        }
    }
}

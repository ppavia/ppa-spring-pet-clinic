package petclinic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import petclinic.web.PpaPetClinicApplication;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = PpaPetClinicApplication.class)
class PpaSpringPetClinicApplicationTests {
    @Test
    void contextLoads() {
        assertTrue(true);
    }
}

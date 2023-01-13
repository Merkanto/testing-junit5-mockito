package merkanto.testingjunit5mockito.services.springdatajpa;

import merkanto.testingjunit5mockito.repositories.VetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class VetSDJpaServiceTest {

    @Mock
    VetRepository vetRepository;

    @InjectMocks
    VetSDJpaService vetSDJpaService;

    @Test
    void deleteById() {

        vetSDJpaService.deleteById(1L);
        verify(vetRepository).deleteById(1L);
    }
}
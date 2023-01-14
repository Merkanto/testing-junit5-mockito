package merkanto.testingjunit5mockito.controllers;

import merkanto.testingjunit5mockito.fauxspring.BindingResult;
import merkanto.testingjunit5mockito.model.Owner;
import merkanto.testingjunit5mockito.services.OwnerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    private static final String OWNERS_CREATE_OR_UPDATE_OWNER_FORM = "owners/createOrUpdateOwnerForm";
    private static final String REDIRECT_OWNERS_5 = "redirect:/owners/5";

    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController ownerController;

    @Mock
    BindingResult bindingResult;

    @Test
    void processCreationFormHasErrors() {
        //given
        Owner owner = new Owner(1L, "Jim", "Bob");
        given(bindingResult.hasErrors()).willReturn(true);

        //when
        String viewName = ownerController.processCreationForm(owner, bindingResult);

        //then
        assertThat(viewName).isEqualToIgnoringCase(OWNERS_CREATE_OR_UPDATE_OWNER_FORM);
    }

    @Test
    void processCreationFormNoErrors() {
        //given
        Owner owner = new Owner(5L, "Jim", "Bob");
        given(bindingResult.hasErrors()).willReturn(false);
        given(ownerService.save(any())).willReturn(owner);

        //when
        String viewName = ownerController.processCreationForm(owner, bindingResult);

        //then
        assertThat(viewName).isEqualToIgnoringCase(REDIRECT_OWNERS_5);
    }
}
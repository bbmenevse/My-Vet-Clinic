package com.example.myvetclinic.controllers;

import com.example.myvetclinic.model.Owner;
import com.example.myvetclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController ownerController;

    MockMvc mockMvc;

    Set<Owner> ownerSet;
    @BeforeEach
    void setUp() {
        ownerSet=new HashSet<>();
        Owner owner1 = new Owner();
        owner1.setId(1L);
        ownerSet.add(owner1);
        Owner owner2 = new Owner();
        owner2.setId(2L);
        ownerSet.add(owner2);

        mockMvc = MockMvcBuilders.standaloneSetup(ownerController).build();
    }

    @Test
    void listOwners() throws Exception{
        when(ownerService.findAll()).thenReturn(ownerSet);
        mockMvc.perform(post("/owners"))
                .andExpect(status().is(200))
                .andExpect(view().name("owners/index"))
                .andExpect(model().attribute("owners",hasSize(2)));
    }


    @Test
    void findOwners() throws Exception {
        mockMvc.perform(post("/owners/find"))
                .andExpect(status().isOk())
                .andExpect(view().name("notimplemented"));
    }
}
package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceVerificationTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Use mock in service
        MyService service = new MyService(mockApi);

        // Act
        service.fetchData();  // this should call getData()

        // Step 3: Verify interaction
        verify(mockApi).getData();  
    }
}

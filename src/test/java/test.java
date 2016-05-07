import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by Meko on 08/05/2016.
 */
public class test {
    @Test
    public void single_test_yo(){
        assert(5 == 5);
    }

    @Test
    public void mock_test(){
        Test_Program ravy = mock(Test_Program.class);
        when(ravy.return_five()).thenReturn(6);
        assert(ravy.return_five() == 6);
    }



}

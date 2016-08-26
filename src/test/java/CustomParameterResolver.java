//
//
//
//import org.junit.jupiter.api.extension.ParameterResolutionException;
//
//import java.lang.reflect.Parameter;
//
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//class CustomParameterResolver implements MethodParameterResolver {
//
//    @Override
//    public boolean supports(Parameter parameter, MethodInvocationContext methodInvocationContext, org.junit.gen5.api.extension.ExtensionContext extensionContext) throws ParameterResolutionException {
//        return parameter.getAnnotations().length == 1 && parameter.getAnnotations()[0].annotationType().isAssignableFrom(Custom.class);
//    }
//
//    @Override
//    public Object resolve(Parameter parameter, MethodInvocationContext methodInvocationContext, org.junit.gen5.api.extension.ExtensionContext extensionContext) throws ParameterResolutionException {
//        final CustomParameter mock = mock(CustomParameter.class);
//        when(mock.getValue()).thenReturn("a");
//        return mock;
//    }
//}

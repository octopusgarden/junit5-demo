


import org.junit.gen5.api.extension.ExtensionContext;
import org.junit.gen5.api.extension.MethodInvocationContext;
import org.junit.gen5.api.extension.MethodParameterResolver;

import java.lang.reflect.Parameter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CustomParameterResolver implements MethodParameterResolver {


    @Override
    public boolean supports(Parameter parameter, MethodInvocationContext methodInvocationContext, ExtensionContext extensionContext) {
        return parameter.getAnnotations().length == 1 && parameter.getAnnotations()[0].annotationType().isAssignableFrom(Custom.class);
    }

    @Override
    public Object resolve(Parameter parameter, MethodInvocationContext methodInvocationContext, ExtensionContext extensionContext) {
        final CustomParameter mock = mock(CustomParameter.class);
        when(mock.getValue()).thenReturn("a");
        return mock;
    }
}

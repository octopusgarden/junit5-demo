

import org.junit.gen5.api.extension.*;
import org.junit.gen5.api.extension.ExtensionContext.Namespace;
import org.junit.gen5.api.extension.ExtensionContext.Store;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Parameter;

import static org.mockito.Mockito.mock;

public class MockitoExtension implements InstancePostProcessor, MethodParameterResolver {

    private static final Namespace namespace = Namespace.of(MockitoExtension.class);

    @Override
    public void postProcessTestInstance(TestExtensionContext context) {
        MockitoAnnotations.initMocks(context.getTestInstance());
    }

    @Override
    public boolean supports(Parameter parameter, MethodInvocationContext methodInvocationContext,
                            ExtensionContext extensionContext) {

        return parameter.isAnnotationPresent(InjectMock.class);
    }

    @Override
    public Object resolve(Parameter parameter, MethodInvocationContext methodInvocationContext,
                          ExtensionContext extensionContext) throws ParameterResolutionException {
        Store mocks = extensionContext.getStore(namespace);
        return getMock(parameter.getType(), mocks);
    }

    private Object getMock(Class<?> mockType, Store mocks) {
        return mocks.getOrComputeIfAbsent(mockType, type -> mock(mockType));
    }
}

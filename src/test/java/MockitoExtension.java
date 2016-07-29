//
//
//import org.junit.gen5.api.extension.*;
//
//import java.lang.reflect.Parameter;
//
//import static org.mockito.Mockito.mock;
//
//class MockitoExtension implements InstancePostProcessor, MethodParameterResolver {
//
//    private static final ExtensionContext.Namespace namespace = org.junit.gen5.api.extension.ExtensionContext.Namespace.of(MockitoExtension.class);
//
//    @Override
//    public void postProcessTestInstance(TestExtensionContext context) {
//        //MockitoAnnotations.initMocks(context.getTestInstance());
//    }
//
//    @Override
//    public boolean supports(Parameter parameter, MethodInvocationContext methodInvocationContext,
//                            ExtensionContext extensionContext) {
//
//        return parameter.isAnnotationPresent(InjectMock.class);
//    }
//
//    @Override
//    public Object resolve(Parameter parameter, MethodInvocationContext methodInvocationContext,
//                          ExtensionContext extensionContext) throws ParameterResolutionException {
//        ExtensionContext.Store mocks = extensionContext.getStore(namespace);
//        return getMock(parameter.getType(), mocks);
//    }
//
//    private Object getMock(Class<?> mockType, ExtensionContext.Store mocks) {
//        return mocks.getOrComputeIfAbsent(mockType, type -> mock(mockType));
//    }
//}

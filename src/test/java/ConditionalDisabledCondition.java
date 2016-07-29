

import org.junit.jupiter.api.extension.*;
import org.junit.platform.commons.util.AnnotationUtils;

import java.util.Optional;
import java.util.Random;

class ConditionalDisabledCondition implements TestExecutionCondition, ContainerExecutionCondition {

    private final Random random = new Random();

    @Override
    public ConditionEvaluationResult evaluate(TestExtensionContext testExtensionContext) {
        Optional<ConditionalDisabled> disabled = AnnotationUtils.findAnnotation(testExtensionContext.getElement(), ConditionalDisabled.class);

        if (disabled.isPresent()) {
            final int nextInt = this.random.nextInt(5);
            if (nextInt > 4) {
                return ConditionEvaluationResult.enabled("I feel like running the test");
            }
            return ConditionEvaluationResult.disabled("I don't feel like running the test");
        }
        return ConditionEvaluationResult.enabled("Test is run");
    }

    @Override
    public ConditionEvaluationResult evaluate(ContainerExtensionContext context) {
        return ConditionEvaluationResult.enabled("Test is run");
    }
}
